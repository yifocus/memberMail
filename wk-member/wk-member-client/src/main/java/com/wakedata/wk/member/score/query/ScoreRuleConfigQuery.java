package com.wakedata.wk.member.score.query;

import com.wakedata.common.dto.PageQuery;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author Neexz
 * @date 2021/2/2
 */
@Data
public class ScoreRuleConfigQuery extends PageQuery {

    @ApiModelProperty("集团Id")
    private Long epId;

    @ApiModelProperty("业态Id")
    private Long appId;

    @ApiModelProperty("项目Id")
    private Long storeId;

    @ApiModelProperty("积分规则名称")
    private String ruleName;

    @ApiModelProperty("积分规则类型 1-发放 2-消耗")
    private Integer ruleType;

    @ApiModelProperty("逻辑删除位，1-有效，0-无效")
    private Integer deletedFlag;
}
