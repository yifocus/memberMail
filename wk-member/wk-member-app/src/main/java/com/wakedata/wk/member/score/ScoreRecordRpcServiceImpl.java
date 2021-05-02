package com.wakedata.wk.member.score;

import com.wakedata.common.dto.PageResultDTO;
import com.wakedata.common.dto.ResultDTO;
import com.wakedata.wk.member.common.wrappInfo.WrapInfo;
import com.wakedata.wk.member.domain.store.ScoreRecordService;
import com.wakedata.wk.member.score.rpc.ScoreRecordRpcService;
import com.wakedata.wk.member.score.dto.ScoreRecordDTO;
import com.wakedata.wk.member.score.query.ScoreRecordQuery;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: hhf
 * @date: 2021/1/30
 **/
@DubboService
public class ScoreRecordRpcServiceImpl implements ScoreRecordRpcService {

    @Autowired
    ScoreRecordService scoreRecordService;

    @Override
    @WrapInfo
    public ResultDTO<ScoreRecordDTO> detail(Long id) {
        ScoreRecordDTO memberScoreRecord = scoreRecordService.queryById(id);
        return ResultDTO.success(memberScoreRecord);
    }

    @Override
    @WrapInfo
    public PageResultDTO<List<ScoreRecordDTO>> list(ScoreRecordQuery pageQuery) {
        return scoreRecordService.queryPage(pageQuery);
    }

    @Override
    public ResultDTO<Long> add(ScoreRecordDTO configDTO) {
        return ResultDTO.success(scoreRecordService.insert(configDTO));
    }

    @Override
    public ResultDTO<Boolean> update(ScoreRecordDTO configDTO) {
        return ResultDTO.success(scoreRecordService.update(configDTO));
    }
}
