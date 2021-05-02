package com.wakedata.wk.member.score.query;

import com.wakedata.common.dto.PageQuery;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 会员积分记录DTO
 *
 * @author hhf
 * @since 2021-02-04 19:47:29
 */
@Data
@ApiModel(value="ScoreRecordQuery", description="会员积分记录查询条件")
public class ScoreRecordQuery extends PageQuery implements Serializable {

    private static final long serialVersionUID = 7958798756415309919L;
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
    private Integer quantity;
    /**
     * 积分倍率数量
     */
    private Integer rateQuantity;
    /**
     * 变更类型 1-增加，2-减少
     */
    private Integer type;
    /**
     * 积分事件key
     */
    private String eventKey;
    /**
     * 关联的业务类型
     */
    private Integer bussinessType;
    /**
     * 关联的业务单号
     */
    private String bussinessNo;
    /**
     * 渠道Id
     */
    private Integer channelId;
    /**
     * 积分变动描述
     */
    private String desc;
    /**
     * 积分有效时间
     */
    private LocalDateTime validTime;
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

}