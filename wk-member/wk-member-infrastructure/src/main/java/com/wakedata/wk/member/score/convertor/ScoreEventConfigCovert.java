package com.wakedata.wk.member.score.convertor;

import com.wakedata.wk.member.common.base.BaseConvert;
import com.wakedata.wk.member.score.dto.ScoreEventConfigDTO;
import com.wakedata.wk.member.score.repository.model.ScoreEventConfigDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author Neexz
 * @date 2021/2/3
 */
@Mapper
public interface ScoreEventConfigCovert extends BaseConvert<ScoreEventConfigDTO, ScoreEventConfigDO> {

    ScoreEventConfigCovert INSTANCE = Mappers.getMapper(ScoreEventConfigCovert.class);
}
