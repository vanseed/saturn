package com.vanseed.saturn.support.exception;

/**
 * description
 *
 * @author leon
 * @date 2019/05/20
 * @copyright vanseed
 */
public class ErrorType {
    private String errorCode;
    private String[] errorParas;

    public static ErrorType init(String errorCode){
        ErrorType type = new ErrorType();
        type.setErrorCode(errorCode);
        return type;
    }

    public static ErrorType init(String errorCode, String... errorParas){
        ErrorType type = new ErrorType();
        type.setErrorCode(errorCode);
        type.setErrorParas(errorParas);
        return type;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String[] getErrorParas() {
        return errorParas;
    }

    public void setErrorParas(String[] errorParas) {
        this.errorParas = errorParas;
    }
}
