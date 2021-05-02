package com.wakedata.wk.member.score.repository;

import com.wakedata.wk.member.score.query.ScoreRecordQuery;
import com.wakedata.wk.member.score.repository.model.ScoreRecordDO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 会员积分记录表 (MemberScoreRecord)表数据库访问层
 *
 * @author hhf
 * @since 2021-02-04 19:47:31
 */
@Repository
public interface ScoreRecordMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ScoreRecordDO queryById(Long id);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param query 查询条件
     * @return 对象列表
     */
    List<ScoreRecordDO> queryAll(ScoreRecordQuery query);

    /**
     * 新增数据
     *
     * @param memberScoreRecord 实例对象
     * @return 主键ID
     */
    Long insert(ScoreRecordDO memberScoreRecord);

    /**
     * 修改数据
     *
     * @param memberScoreRecord 实例对象
     * @return 影响行数
     */
    int update(ScoreRecordDO memberScoreRecord);

}