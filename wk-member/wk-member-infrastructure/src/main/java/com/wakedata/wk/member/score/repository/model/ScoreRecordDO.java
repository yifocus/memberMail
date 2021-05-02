package com.wakedata.wk.member.score.repository.model;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 会员积分记录表 (MemberScoreRecord)实体类
 *
 * @author hhf
 * @since 2021-02-04 19:47:29
 */
@Data
public class ScoreRecordDO implements Serializable {

    private static final long serialVersionUID = 744173150768015743L;
    /**
     * 自增Id
     */
    private Long id;
    /**
     * 集团Id
     */
    private Long epId;
    /**
     * 业态Id
     */
    private Long appId;

    /**
     * 项目ID
     */
    private Long storeId;

    /**
     * 商户ID
     */
    private Long subStoreId;

    /**
     * 集团名称
     */
    private String epName;

    /**
     * 业态名称
     */
    private String appName;

    /**
     * 项目名称
     */
    private String storeName;

    /**
     * 商户名称
     */
    private String subStoreName;

    /**
     * 会员一帐通
     */
    private String uniqueAccountId;
    /**
     * 积分流水记录编号
     */
    private String recordNo;
    /**
     * 变更数量
     */
    private Long amount;
    /**
     * 积分倍率数量
     */
    private Long extAmount;
    /**
     * 变更类型 1-增加，2-减少，3-过期
     */
    private Integer type;
    /**
     * 积分事件key
     */
    private String eventKey;

    /**
     * 积分事件名称
     */
    private String eventName;

    /**
     * 关联的业务类型
     */
    private Integer businessType;
    /**
     * 关联的业务单号
     */
    private String businessNo;
    /**
     * 渠道Id
     */
    private Integer channelId;
    /**
     * 积分变动描述
     */
    private String desc;
    /**
     * 操作人
     */
    private String operator;
    /**
     * 创建时间
     */
    private LocalDateTime createTime;
    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 积分规则
     */
    private String scoreRuleId;

    /**
     * 积分规则名称
     */
    private String scoreRuleName;

    /**
     * 积分比例
     */
    private String scoreRuleRatio;
}