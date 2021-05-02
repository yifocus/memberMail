package com.wakedata.wk.member.score.convertor;

import com.wakedata.wk.member.common.base.BaseConvert;
import com.wakedata.wk.member.score.dto.ScoreRuleConfigDTO;
import com.wakedata.wk.member.score.repository.model.ScoreRuleConfigDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author Neexz
 * @date 2021/2/2
 */
@Mapper
public interface ScoreRuleConfigCovert extends BaseConvert<ScoreRuleConfigDTO, ScoreRuleConfigDO> {

    ScoreRuleConfigCovert INSTANCE = Mappers.getMapper(ScoreRuleConfigCovert.class);
}
