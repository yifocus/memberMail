package com.wakedata.wk.member.score.repository;

import com.wakedata.common.mybatis.plus.mapper.CommonMapper;
import com.wakedata.wk.member.score.repository.model.ScoreEventConfigDO;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 积分事件配置表  Mapper 接口
 * </p>
 *
 * @author neexz
 * @since 2021-02-03
 */
@Repository
public interface ScoreEventConfigMapper extends CommonMapper<ScoreEventConfigDO> {

}
