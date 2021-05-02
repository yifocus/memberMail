package com.wakedata.wk.member.score;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wakedata.common.dto.PageResultDTO;
import com.wakedata.common.util.BeanUtil;
import com.wakedata.common.util.OrderByUtil;
import com.wakedata.wk.member.domain.store.ScoreRecordService;
import com.wakedata.wk.member.score.dto.ScoreRecordDTO;
import com.wakedata.wk.member.score.query.ScoreRecordQuery;
import com.wakedata.wk.member.score.repository.ScoreRecordMapper;
import com.wakedata.wk.member.score.repository.model.ScoreRecordDO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 会员积分记录服务实现类
 *
 * @author hhf
 * @since 2021-01-29 18:18:49
 */
@Service
public class ScoreRecordServiceImpl implements ScoreRecordService {
    @Resource
    private ScoreRecordMapper scoreRecordMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public ScoreRecordDTO queryById(Long id) {
        ScoreRecordDO memberScoreRecord = scoreRecordMapper.queryById(id);
        return BeanUtil.copy(memberScoreRecord, ScoreRecordDTO.class);
    }

    /**
     * 查询多条数据
     *
     * @return 对象列表
     */
    @Override
    public PageResultDTO<List<ScoreRecordDTO>> queryPage(ScoreRecordQuery query) {

        Page page = PageHelper.startPage(query.getPageNo(), query.getPageSize());
        String orderBy = OrderByUtil.buildOderBySql(query);
        if (StringUtils.isNotEmpty(orderBy)) {
            page.setOrderBy(orderBy);
        }

        List<ScoreRecordDO> allOrderPresentList = scoreRecordMapper.queryAll(query);
        PageInfo<ScoreRecordDO> pageInfo = new PageInfo<>(allOrderPresentList);

        PageResultDTO<List<ScoreRecordDTO>> pageResultDTO = new PageResultDTO<>();
        pageResultDTO.setPageNo(pageInfo.getPageNum());
        pageResultDTO.setPageSize(pageInfo.getSize());
        pageResultDTO.setTotalCount(pageInfo.getTotal());
        pageResultDTO.setData(BeanUtil.copyList(pageInfo.getList(), ScoreRecordDTO.class));
        return pageResultDTO;
    }

    /**
     * 新增数据
     *
     * @param memberScoreRecord 实例对象
     * @return 实例对象
     */
    @Override
    public Long insert(ScoreRecordDTO memberScoreRecord) {
        ScoreRecordDO memberScoreRecordDO = BeanUtil.copy(memberScoreRecord, ScoreRecordDO.class);
        if (scoreRecordMapper.insert(memberScoreRecordDO) > 0) {
            return memberScoreRecordDO.getId();
        }
        return null;
    }

    /**
     * 修改数据
     *
     * @param memberScoreRecord 实例对象
     * @return 实例对象
     */
    @Override
    public boolean update(ScoreRecordDTO memberScoreRecord) {
        ScoreRecordDO memberScoreRecordDO = BeanUtil.copy(memberScoreRecord, ScoreRecordDO.class);
        return scoreRecordMapper.update(memberScoreRecordDO) > 0;
    }

}