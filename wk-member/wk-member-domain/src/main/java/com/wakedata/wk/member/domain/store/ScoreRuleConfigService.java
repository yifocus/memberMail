package com.wakedata.wk.member.domain.store;

import com.wakedata.common.dto.PageResultDTO;
import com.wakedata.wk.member.score.dto.ScoreRuleConfigDTO;
import com.wakedata.wk.member.score.query.ScoreRuleConfigQuery;

import java.util.List;

/**
 * @author Neexz
 * @date 2021/2/2
 */
public interface ScoreRuleConfigService {

    boolean save(ScoreRuleConfigDTO configDTO);

    ScoreRuleConfigDTO detail(Long id);

    boolean update(ScoreRuleConfigDTO configDTO);

    boolean delete(Long id, Long epId);

    boolean logicDelete(Long id, Long epId);

    PageResultDTO<List<ScoreRuleConfigDTO>> list(ScoreRuleConfigQuery query);
}
