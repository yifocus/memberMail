package com.wakedata.wk.member.score.repository.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wakedata.common.po.UmpEpDO;
import lombok.Data;

/**
 * <p>
 * 积分事件配置表
 * </p>
 *
 * @author neexz
 * @since 2021-02-03
 */
@Data
@TableName("m_score_event_config")
public class ScoreEventConfigDO extends UmpEpDO {

    /**
     * 事件Key
     */
    @TableField("EVENT_KEY")
    private String eventKey;

    /**
     * 事件名称
     */
    @TableField("EVENT_NAME")
    private String eventName;

    /**
     * 事件类型 1-发放，2-消耗
     */
    @TableField("EVENT_TYPE")
    private Integer eventType;

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

}
