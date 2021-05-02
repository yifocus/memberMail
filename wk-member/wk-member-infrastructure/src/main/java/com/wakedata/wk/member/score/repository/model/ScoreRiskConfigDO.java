package com.wakedata.wk.member.score.repository.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author luomeng
 * @date 2021/02/24 10:10
 */
@Data
@NoArgsConstructor
public class ScoreRiskConfigDO implements Serializable {

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
     * 业态Id 为0表示全局积分，>0 表示该应用积分
     */
    private Long appId;

    /**
     * 类型 1：发放 2：消耗
     */
    private Integer type;

    /**
     * 积分事件Key all-表示全部
     */
    private String eventKey;

    /**
     * 积分事件名称
     */
    private String eventName;

    /**
     * 规则配置-新的规则配置
     */
    private String ruleJson;

    /**
     * 已生效的规则配置
     */
    private String validRuleJson;

    /**
     * 生效规则变更时间
     */
    private Date validUpdateTime;

    /**
     * 逻辑有效位 1-有效, 0-无效
     */
    private Integer deletedFlag;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 更新人
     */
    private String updateBy;


}
