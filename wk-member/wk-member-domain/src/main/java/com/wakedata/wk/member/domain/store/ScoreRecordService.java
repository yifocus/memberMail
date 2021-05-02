package com.wakedata.wk.member.domain.store;

import com.wakedata.common.dto.PageResultDTO;
import com.wakedata.wk.member.score.dto.ScoreRecordDTO;
import com.wakedata.wk.member.score.query.ScoreRecordQuery;

import java.util.List;

/**
 * 会员积分记录服务接口
 *
 * @author hhf
 * @since 2021-01-29 18:18:48
 */
public interface ScoreRecordService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ScoreRecordDTO queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param query 查询条件
     * @return 对象列表
     */
    PageResultDTO<List<ScoreRecordDTO>> queryPage(ScoreRecordQuery query);

    /**
     * 新增数据
     *
     * @param growthConfig 实例对象
     * @return 新插入数据的主键
     */
    Long insert(ScoreRecordDTO growthConfig);

    /**
     * 修改数据
     *
     * @param growthConfig 实例对象
     * @return true/false
     */
    boolean update(ScoreRecordDTO growthConfig);

}