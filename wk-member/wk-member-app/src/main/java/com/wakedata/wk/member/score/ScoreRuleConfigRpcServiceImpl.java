package com.wakedata.wk.member.score;

import com.wakedata.common.dto.ResultDTO;
import com.wakedata.wk.member.domain.store.ScoreRuleConfigService;
import com.wakedata.wk.member.score.rpc.ScoreRuleConfigRpcService;
import com.wakedata.wk.member.score.dto.ScoreRuleConfigDTO;
import com.wakedata.wk.member.score.query.ScoreRuleConfigQuery;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Neexz
 * @date 2021/2/2
 */
@Slf4j
@DubboService
public class ScoreRuleConfigRpcServiceImpl implements ScoreRuleConfigRpcService {

    @Resource
    private ScoreRuleConfigService scoreRuleConfigService;

    @Override
    public ResultDTO<ScoreRuleConfigDTO> detail(Long id) {
        return ResultDTO.success(scoreRuleConfigService.detail(id));
    }

    @Override
    public ResultDTO<List<ScoreRuleConfigDTO>> list(ScoreRuleConfigQuery query) {
        return scoreRuleConfigService.list(query);
    }

    @Override
    public ResultDTO<Boolean> add(ScoreRuleConfigDTO configDTO) {
        return ResultDTO.success(scoreRuleConfigService.save(configDTO));
    }

    @Override
    public ResultDTO<Boolean> update(ScoreRuleConfigDTO configDTO) {
        return ResultDTO.success(scoreRuleConfigService.update(configDTO));
    }

    @Override
    public ResultDTO<Boolean> delete(Long id) {
        return ResultDTO.success(scoreRuleConfigService.logicDelete(id, null));
    }
}
