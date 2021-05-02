package com.wakedata.wk.member.domain.store;

import com.wakedata.common.dto.PageResultDTO;
import com.wakedata.wk.member.score.dto.ScoreEventConfigDTO;
import com.wakedata.wk.member.score.query.ScoreEventConfigQuery;

import java.util.List;

/**
 * @author Neexz
 * @date 2021/2/3
 */
public interface ScoreEventConfigService {

    boolean save(ScoreEventConfigDTO configDTO);

    ScoreEventConfigDTO detail(Long id);

    boolean update(ScoreEventConfigDTO configDTO);

    boolean delete(Long id, Long epId);

    boolean logicDelete(Long id, Long epId);

    PageResultDTO<List<ScoreEventConfigDTO>> list(ScoreEventConfigQuery query);
}
