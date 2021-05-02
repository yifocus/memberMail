package com.wakedata.wk.member.score.repository;

import com.wakedata.common.mybatis.plus.mapper.CommonMapper;
import com.wakedata.wk.member.score.repository.model.ScoreRuleConfigDO;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 积分规则配置表  Mapper 接口
 * </p>
 *
 * @author neexz
 * @since 2021-02-02
 */
@Repository
public interface ScoreRuleConfigMapper extends CommonMapper<ScoreRuleConfigDO> {

}
