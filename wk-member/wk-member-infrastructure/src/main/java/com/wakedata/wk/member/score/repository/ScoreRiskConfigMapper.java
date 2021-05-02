package com.wakedata.wk.member.score.repository;

import com.wakedata.wk.member.score.repository.model.ScoreRiskConfigDO;
import org.springframework.stereotype.Repository;

/**
 * @author luomeng
 * @date 2021/02/24 10:10
 */
@Repository
public interface ScoreRiskConfigMapper {

    /**
     * 根据ID查询
     * @param id
     * @return
     */
    ScoreRiskConfigDO findById(long id);

    /**
     * 新增
     * @param scoreriskconfigdo
     * @return
     */
    int insert(ScoreRiskConfigDO scoreriskconfigdo);

    /**
     * 修改
     * @param scoreriskconfigdo
     * @return
     */
    int update(ScoreRiskConfigDO scoreriskconfigdo);

}
