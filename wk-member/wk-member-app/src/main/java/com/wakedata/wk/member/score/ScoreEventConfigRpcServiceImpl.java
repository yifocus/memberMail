package com.wakedata.wk.member.score;

import com.wakedata.common.dto.ResultDTO;
import com.wakedata.wk.member.domain.store.ScoreEventConfigService;
import com.wakedata.wk.member.score.rpc.ScoreEventConfigRpcService;
import com.wakedata.wk.member.score.dto.ScoreEventConfigDTO;
import com.wakedata.wk.member.score.query.ScoreEventConfigQuery;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Neexz
 * @date 2021/2/3
 */
@DubboService
public class ScoreEventConfigRpcServiceImpl implements ScoreEventConfigRpcService {
    
    @Resource
    private ScoreEventConfigService scoreEventConfigService;

    @Override
    public ResultDTO<ScoreEventConfigDTO> detail(Long id) {
        return ResultDTO.success(scoreEventConfigService.detail(id));
    }

    @Override
    public ResultDTO<List<ScoreEventConfigDTO>> list(ScoreEventConfigQuery query) {
        return scoreEventConfigService.list(query);
    }

    @Override
    public ResultDTO<Boolean> add(ScoreEventConfigDTO configDTO) {
        return ResultDTO.success(scoreEventConfigService.save(configDTO));
    }

    @Override
    public ResultDTO<Boolean> update(ScoreEventConfigDTO configDTO) {
        return ResultDTO.success(scoreEventConfigService.update(configDTO));
    }

    @Override
    public ResultDTO<Boolean> delete(Long id) {
        return ResultDTO.success(scoreEventConfigService.logicDelete(id, null));
    }
}
