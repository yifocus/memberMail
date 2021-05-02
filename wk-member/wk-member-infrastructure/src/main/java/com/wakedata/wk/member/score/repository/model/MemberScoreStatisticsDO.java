package com.wakedata.wk.member.score.repository.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author luomeng
 * @date 2021/2/25 15:33
 */
@Data
@NoArgsConstructor
public class MemberScoreStatisticsDO implements Serializable {

    private static final long serialVersionUID = 744173150768015743L;

    /**
     * 集团ID
     */
    private Long epId;

    /**
     * 业态ID
     */
    private Long appId;

    /**
     * 会员一帐通
     */
    private String uniqueAccountId;

    /**
     * 积分余额
     */
    private Long score;

    /**
     * 将到期积分
     */
    private Long expireScore;

    /**
     * 累计消耗积分
     */
    private Long consumeScore;


}
