package com.wakedata.wk.member.score.repository.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 会员数据缓存-积分风控
 * @author luomeng
 * @date 2021/3/2 17:24
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ScoreRiskMemberCacheData implements Serializable {

    private static final long serialVersionUID = -940365426515771477L;

    /**
     * 当天增加数量
     */
    private Long amount;
    /**
     * 当天增加次数
     */
    private Integer frequency;
    /**
     * 当月增加数量
     */
    private Long monthAmount;
    /**
     * 当月增加次数
     */
    private Integer monthFrequency;

    /**
     * 当前缓存版本-使用数据库自增ID
     */
    private Long version;

}
