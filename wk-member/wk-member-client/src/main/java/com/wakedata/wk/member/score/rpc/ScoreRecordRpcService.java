package com.wakedata.wk.member.score.rpc;

import com.wakedata.common.dto.PageResultDTO;
import com.wakedata.common.dto.ResultDTO;
import com.wakedata.wk.member.score.dto.ScoreRecordDTO;
import com.wakedata.wk.member.score.query.ScoreRecordQuery;

import java.util.List;

/**
 * 会员积分记录api
 * @author hhf
 * @date 2021/1/25
 */
public interface ScoreRecordRpcService {

    /**
     * 获取会员积分记录详情
     * @param id
     * @return
     */
    ResultDTO<ScoreRecordDTO> detail(Long id);

    /**
     * 分页查询会员积分记录
     * @param pageQuery
     * @return
     */
    PageResultDTO<List<ScoreRecordDTO>> list(ScoreRecordQuery pageQuery);

    /**
     * 新增会员积分记录
     * @param configDTO
     * @return
     */
    ResultDTO<Long> add(ScoreRecordDTO configDTO);

    /**
     * 更新会员积分记录
     * @param configDTO
     * @return
     */
    ResultDTO<Boolean> update(ScoreRecordDTO configDTO);

}
