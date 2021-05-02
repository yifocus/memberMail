package com.wakedata.wk.member.score.rpc;

import com.wakedata.common.dto.ResultDTO;
import com.wakedata.wk.member.score.dto.ScoreEventConfigDTO;
import com.wakedata.wk.member.score.query.ScoreEventConfigQuery;

import java.util.List;

/**
 * 积分事件配置接口
 * @author Neexz
 * @date 2021/2/3
 */
public interface ScoreEventConfigRpcService {

    /**
     * 获取积分事件配置详情
     * @param id
     * @return
     */
    ResultDTO<ScoreEventConfigDTO> detail(Long id);

    /**
     * 分页查询积分事件值配置
     * @param query
     * @return
     */
    ResultDTO<List<ScoreEventConfigDTO>> list(ScoreEventConfigQuery query);

    /**
     * 新增积分事件配置
     * @param configDTO
     * @return
     */
    ResultDTO<Boolean> add(ScoreEventConfigDTO configDTO);

    /**
     * 更新积分事件配置
     * @param configDTO
     * @return
     */
    ResultDTO<Boolean> update(ScoreEventConfigDTO configDTO);

    /**
     * 删除积分事件配置
     * @param id
     * @return
     */
    ResultDTO<Boolean> delete(Long id);
}