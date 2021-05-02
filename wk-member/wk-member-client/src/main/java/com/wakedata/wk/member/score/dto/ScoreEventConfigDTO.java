package com.wakedata.wk.member.score.dto;

import com.wakedata.common.dto.UmpEpDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author Neexz
 * @date 2021/2/3
 */
@Data
public class ScoreEventConfigDTO extends UmpEpDTO {

    @ApiModelProperty("事件Key")
    private String eventKey;

    @ApiModelProperty("事件名称")
    private String eventName;

    @ApiModelProperty("事件类型 1-发放，2-消耗")
    private Integer eventType;

    @ApiModelProperty("逻辑删除位，1-有效，0-无效")
    private Integer deletedFlag;

    @ApiModelProperty("创建人")
    private String createBy;

    @ApiModelProperty("更新人")
    private String updateBy;
}
