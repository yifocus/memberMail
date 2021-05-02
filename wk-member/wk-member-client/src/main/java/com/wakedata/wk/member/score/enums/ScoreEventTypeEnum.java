package com.wakedata.wk.member.score.enums;

import com.wakedata.common.po.BaseEnum;

/**
 * @author Neexz
 * @date 2021/2/3
 */
public enum ScoreEventTypeEnum implements BaseEnum {

    /**
     * 积分事件类型
     */
    PRODUCE(1, "发放"),
    CONSUME(2, "消费");

    private int code;
    private String desc;

    ScoreEventTypeEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    @Override
    public Object getValue() {
        return null;
    }

    @Override
    public String getDesc() {
        return null;
    }
}
