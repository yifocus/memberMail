package com.wakedata.wk.member.score.rpc;

import com.wakedata.common.dto.ResultDTO;
import com.wakedata.wk.member.score.dto.ScoreRuleConfigDTO;
import com.wakedata.wk.member.score.query.ScoreRuleConfigQuery;

import java.util.List;


/**
 * 积分规则配置接口
 * @author Neexz
 * @date 2021/1/29
 */
public interface ScoreRuleConfigRpcService {

    /**
     * 获取积分规则配置详情
     * @param id
     * @return
     */
    ResultDTO<ScoreRuleConfigDTO> detail(Long id);

    /**
     * 分页查询积分规则值配置
     * @param query
     * @return
     */
    ResultDTO<List<ScoreRuleConfigDTO>> list(ScoreRuleConfigQuery query);

    /**
     * 新增积分规则配置
     * @param configDTO
     * @return
     */
    ResultDTO<Boolean> add(ScoreRuleConfigDTO configDTO);

    /**
     * 更新积分规则配置
     * @param configDTO
     * @return
     */
    ResultDTO<Boolean> update(ScoreRuleConfigDTO configDTO);

    /**
     * 删除积分规则配置
     * @param id
     * @return
     */
    ResultDTO<Boolean> delete(Long id);
}
