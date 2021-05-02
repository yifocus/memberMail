package com.wakedata.wk.member.score.repository.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wakedata.common.po.UmpEpDO;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

/**
 * <p>
 * 积分规则配置表
 * </p>
 *
 * @author neexz
 * @since 2021-02-02
 */
@Data
@TableName("m_score_rule_config")
public class ScoreRuleConfigDO extends UmpEpDO {

    @TableField("VALID_APP")
    private String validApp;

    /**
     * 规则名称
     */
    @TableField("RULE_NAME")
    private String ruleName;

    /**
     * 规则类型 1-发放 2-消费
     */
    @TableField("RULE_TYPE")
    private Integer ruleType;

    /**
     * 有效时间类型 1-永久有效，2-固定时间段
     */
    @TableField("VALID_TYPE")
    private Integer validType;

    /**
     * 有效开始时间 对应永久有效类型
     */
    @TableField("VALID_START_TIME")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime validStartTime;

    /**
     * 有效结束时间 对应固定有效时间段的结束时间
     */
    @TableField("VALID_END_TIME")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime validEndTime;

    /**
     * 对应的积分事件key
     */
    @TableField("EVENT_KEY")
    private String eventKey;

    /**
     * 积分规则对应的配置，用json组装
     */
    @TableField("EVENT_JSON")
    private String eventJson;

    /**
     * 逻辑删除位，1-有效，0-无效
     */
    @TableField("DELETED_FLAG")
    private Integer deletedFlag;

    /**
     * 创建人
     */
    @TableField("CREATE_BY")
    private String createBy;

    /**
     * 更新人
     */
    @TableField("UPDATE_BY")
    private String updateBy;

    /**
     * 规则来源 1-集团 2-业态
     */
    @TableField("SOURCE")
    private Integer ruleSource;
}
