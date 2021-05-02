package com.wakedata.wk.member.score;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wakedata.common.dto.PageResultDTO;
import com.wakedata.common.mybatis.plus.query.QueryWrapperX;
import com.wakedata.common.util.OrderByUtil;
import com.wakedata.wk.member.common.exception.MemberException;
import com.wakedata.wk.member.domain.store.ScoreRuleConfigService;
import com.wakedata.wk.member.score.convertor.ScoreRuleConfigCovert;
import com.wakedata.wk.member.score.dto.ScoreRuleConfigDTO;
import com.wakedata.wk.member.score.query.ScoreRuleConfigQuery;
import com.wakedata.wk.member.score.repository.ScoreRuleConfigMapper;
import com.wakedata.wk.member.score.repository.model.ScoreRuleConfigDO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Neexz
 * @date 2021/2/2
 */
@Slf4j
@Service
@Primary
public class ScoreRuleConfigServiceImpl implements ScoreRuleConfigService {

    @Resource
    private ScoreRuleConfigMapper configMapper;


    @Override
    public boolean save(ScoreRuleConfigDTO configDTO) {
        ScoreRuleConfigDO configDO = ScoreRuleConfigCovert.INSTANCE.dto2Do(configDTO);
        configDO.setCreateTime(LocalDateTime.now());
        configDO.setUpdateTime(LocalDateTime.now());
        return configMapper.insert(configDO) == 1;
    }

    @Override
    public ScoreRuleConfigDTO detail(Long id) {
        return ScoreRuleConfigCovert.INSTANCE.do2Dto(configMapper.selectById(id));
    }

    @Override
    public boolean update(ScoreRuleConfigDTO configDTO) {
        ScoreRuleConfigDO configDO = ScoreRuleConfigCovert.INSTANCE.dto2Do(configDTO);
        configDO.setUpdateTime(LocalDateTime.now());
        return configMapper.updateById(configDO) == 1;
    }

    @Override
    public boolean delete(Long id, Long epId) {
        QueryWrapperX<ScoreRuleConfigDO> queryWrapperX = new QueryWrapperX<ScoreRuleConfigDO>()
                .eqIfPresent("EP_ID", epId)
                .eq("ID", id);
        return configMapper.deleteById(queryWrapperX) == 1;
    }

    @Override
    public boolean logicDelete(Long id, Long epId) {
        ScoreRuleConfigDO configDO = configMapper.selectOne(
                new QueryWrapperX<ScoreRuleConfigDO>()
                        .eqIfPresent("EP_ID", epId)
                        .eq("ID", id));
        if (configDO == null) {
            log.warn("找不到对应epId[{}]积分规则配置信息", epId);
            throw new MemberException("积分规则配置信息");
        }

        configDO.setDeletedFlag(0);
        configDO.setUpdateTime(LocalDateTime.now());
        return configMapper.updateById(configDO) == 1;
    }

    @Override
    public PageResultDTO<List<ScoreRuleConfigDTO>> list(ScoreRuleConfigQuery query) {
        QueryWrapperX<ScoreRuleConfigDO> queryWrapperX = new QueryWrapperX<>();
        queryWrapperX.eqIfPresent("EP_ID", query.getEpId())
                .eqIfPresent("APP_ID", query.getAppId())
                .likeIfPresent("RULE_NAME", query.getRuleName())
                .eqIfPresent("RULE_TYPE", query.getRuleType())
                .eq("DELETED_FLAG", query.getDeletedFlag() == null ? 1 : query.getDeletedFlag());
        PageInfo<ScoreRuleConfigDO> info = PageHelper.startPage(query.getPageNo(), query.getPageSize())
                .setOrderBy(OrderByUtil.buildOderBySql(query))
                .doSelectPageInfo(() -> configMapper.selectList(queryWrapperX));

        return ScoreRuleConfigCovert.INSTANCE.convertPage(info);
    }

}
