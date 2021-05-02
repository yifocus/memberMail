package com.wakedata.wk.member.score.query;

import com.wakedata.common.dto.PageQuery;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author Neexz
 * @date 2021/2/2
 */
@Data
public class ScoreEventConfigQuery extends PageQuery {

    @ApiModelProperty("集团Id")
    private Long epId;

    @ApiModelProperty("事件Key")
    private String eventKey;

    @ApiModelProperty("事件名称")
    private String eventName;

    @ApiModelProperty("事件类型 1-发放，2-消耗")
    private Integer eventType;

    @ApiModelProperty("逻辑删除位，1-有效，0-无效")
    private Integer deletedFlag;
}
