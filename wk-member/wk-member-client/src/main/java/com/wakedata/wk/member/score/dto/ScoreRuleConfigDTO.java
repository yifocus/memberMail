package com.wakedata.wk.member.score.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.wakedata.common.dto.UmpAppDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

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
public class ScoreRuleConfigDTO extends UmpAppDTO {

    private static final long serialVersionUID = 8821413182694912697L;

    @ApiModelProperty("规则名称")
    private String ruleName;

    @ApiModelProperty("规则类型 1-发放 2-消费")
    private Integer ruleType;

    @ApiModelProperty("有效时间类型 1-永久有效，2-固定时间段")
    private Integer validType;

    @ApiModelProperty("有效开始时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime validStartTime;

    @ApiModelProperty("有效结束时间 对应固定有效时间段的结束时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime validEndTime;

    @ApiModelProperty("对应的积分事件key")
    private String eventKey;

    @ApiModelProperty("积分规则对应的配置，用json组装")
    private String eventJson;

    @ApiModelProperty("逻辑删除位，1-有效，0-无效")
    private Integer deletedFlag;

    @ApiModelProperty("创建人")
    private String createBy;

    @ApiModelProperty("更新人")
    private String updateBy;

}
