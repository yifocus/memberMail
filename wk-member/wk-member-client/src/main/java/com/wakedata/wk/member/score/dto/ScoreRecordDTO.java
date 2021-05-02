package com.wakedata.wk.member.score.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
@ApiModel(value="ScoreRecordDTO", description="会员积分记录DTO")
public class ScoreRecordDTO implements Serializable {

    private static final long serialVersionUID = -940365426515771477L;

    @ApiModelProperty(value = "自增Id")
    private Long id;

    @ApiModelProperty(value = "集团Id")
    private Long epId;

    @ApiModelProperty(value = "集团名称")
    private String epName;

    @ApiModelProperty(value = "业态Id")
    private Long appId;

    @ApiModelProperty(value = "业态名称")
    private String appName;

    @ApiModelProperty(value = "会员一帐通")
    private String uniqueAccountId;

    @ApiModelProperty(value = "积分流水记录编号")
    private String recordNo;

    @ApiModelProperty(value = "变更数量")
    private Integer quantity;

    @ApiModelProperty(value = "积分倍率数量")
    private Integer rateQuantity;

    @ApiModelProperty(value = "变更类型 1-增加，2-减少")
    private Integer type;

    @ApiModelProperty(value = "积分事件key")
    private String eventKey;

    @ApiModelProperty(value = "关联的业务类型")
    private Integer bussinessType;

    @ApiModelProperty(value = "关联的业务单号")
    private String bussinessNo;

    @ApiModelProperty(value = "渠道Id")
    private Integer channelId;

    @ApiModelProperty(value = "积分变动描述")
    private String desc;

    @ApiModelProperty(value = "积分有效时间")
    private LocalDateTime validTime;

    @ApiModelProperty(value = "操作人")
    private String operator;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

}