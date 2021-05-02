package com.wakedata.wk.member.score.enums;

import com.wakedata.common.po.BaseEnum;

/**
 * @author Neexz
 * @date 2021/2/2
 */
public enum ScoreRuleTypeEnum implements BaseEnum {

    /**
     * 积分规则类型
     */
    PRODUCE(1, "生产规则"),
    CONSUME(2, "消费规则");

    private int code;
    private String desc;

    ScoreRuleTypeEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    @Override
    public Object getValue() {
        return code;
    }

    @Override
    public String getDesc() {
        return desc;
    }
}
