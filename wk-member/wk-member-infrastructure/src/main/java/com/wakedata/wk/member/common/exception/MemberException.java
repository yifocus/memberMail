package com.wakedata.wk.member.common.exception;


import com.wakedata.common.exception.BizException;

/**
 * @author pengxu
 * @Date 2018/10/18.
 */
public class MemberException extends BizException {

    private int errorCode;

    private String errorMessage;

    public MemberException(String message) {
        super(message);
        errorMessage = message;
    }

    public MemberException(int errorCode, String errorMessage) {
        super(errorMessage);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

}
