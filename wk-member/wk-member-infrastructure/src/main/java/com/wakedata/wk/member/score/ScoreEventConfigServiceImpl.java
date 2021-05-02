package com.wakedata.wk.member.score;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wakedata.common.dto.PageResultDTO;
import com.wakedata.common.mybatis.plus.query.QueryWrapperX;
import com.wakedata.common.util.OrderByUtil;
import com.wakedata.wk.member.common.exception.MemberException;
import com.wakedata.wk.member.domain.store.ScoreEventConfigService;
import com.wakedata.wk.member.score.convertor.ScoreEventConfigCovert;
import com.wakedata.wk.member.score.dto.ScoreEventConfigDTO;
import com.wakedata.wk.member.score.query.ScoreEventConfigQuery;
import com.wakedata.wk.member.score.repository.ScoreEventConfigMapper;
import com.wakedata.wk.member.score.repository.model.ScoreEventConfigDO;
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
public class ScoreEventConfigServiceImpl implements ScoreEventConfigService {

    @Resource
    private ScoreEventConfigMapper configMapper;


    @Override
    public boolean save(ScoreEventConfigDTO configDTO) {
        ScoreEventConfigDO configDO = ScoreEventConfigCovert.INSTANCE.dto2Do(configDTO);
        configDO.setCreateTime(LocalDateTime.now());
        configDO.setUpdateTime(LocalDateTime.now());
        return configMapper.insert(configDO) == 1;
    }

    @Override
    public ScoreEventConfigDTO detail(Long id) {
        return ScoreEventConfigCovert.INSTANCE.do2Dto(configMapper.selectById(id));
    }

    @Override
    public boolean update(ScoreEventConfigDTO configDTO) {
        ScoreEventConfigDO configDO = ScoreEventConfigCovert.INSTANCE.dto2Do(configDTO);
        configDO.setUpdateTime(LocalDateTime.now());
        return configMapper.updateById(configDO) == 1;
    }

    @Override
    public boolean delete(Long id, Long epId) {
        QueryWrapperX<ScoreEventConfigDO> queryWrapperX = new QueryWrapperX<ScoreEventConfigDO>()
                .eqIfPresent("EP_ID", epId)
                .eq("ID", id);
        return configMapper.deleteById(queryWrapperX) == 1;
    }

    @Override
    public boolean logicDelete(Long id, Long epId) {
        ScoreEventConfigDO configDO = configMapper.selectOne(
                new QueryWrapperX<ScoreEventConfigDO>()
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
    public PageResultDTO<List<ScoreEventConfigDTO>> list(ScoreEventConfigQuery query) {
        QueryWrapperX<ScoreEventConfigDO> queryWrapperX = new QueryWrapperX<>();
        queryWrapperX.eqIfPresent("EP_ID", query.getEpId())
                .eqIfPresent("EVENT_TYPE", query.getEventType())
                .eqIfPresent("EVENT_KEY", query.getEventKey())
                .likeIfPresent("NAME", query.getEventName())
                .eq("DELETED_FLAG", query.getDeletedFlag() == null ? 1 : query.getDeletedFlag());
        PageInfo<ScoreEventConfigDO> info = PageHelper.startPage(query.getPageNo(), query.getPageSize())
                .setOrderBy(OrderByUtil.buildOderBySql(query))
                .doSelectPageInfo(() -> configMapper.selectList(queryWrapperX));

        return ScoreEventConfigCovert.INSTANCE.convertPage(info);
    }

}
