package com.wakedata.wk.member.score.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
@ApiModel(value = "ScoreRiskConfigDTO",description = "积分风控配置")
public class ScoreRiskConfigDTO implements Serializable {

    private static final long serialVersionUID = -940365426515771477L;

    @ApiModelProperty(value = "自增Id")
    private Long id;

    @ApiModelProperty(value = "集团Id")
    private Long epId;

    @ApiModelProperty(value = "业态Id")
    private Long appId;

    @ApiModelProperty(value = "类型 1：发放 2：消耗")
    private Integer type;

    @ApiModelProperty(value = "积分事件Key all-表示全部")
    private String eventKey;

    @ApiModelProperty(value = "规则配置")
    private String ruleJson;

    @ApiModelProperty(value = "逻辑有效位 1-有效, 0-无效")
    private Integer deletedFlag;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "创建人")
    private String createBy;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    @ApiModelProperty(value = "更新人")
    private String updateBy;


}
