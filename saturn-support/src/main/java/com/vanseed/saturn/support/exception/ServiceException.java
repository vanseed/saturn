package com.vanseed.saturn.support.exception;

import com.vanseed.saturn.core.IException;

/**
 * description
 *
 * @author leon
 * @date 2018/11/20
 * @copyright vanseed
 */
public class ServiceException extends RuntimeException implements IException {

    private ErrorType errorType;

    public ServiceException(String msg){
        super(msg);
    }

    public ServiceException(String msg, Throwable exception) {
        super(msg, exception);
    }

    public ServiceException(ErrorType errorType) {
        this.errorType = errorType;
    }

    public ServiceException(ErrorType errorType, Throwable cause) {
        super(cause);
        this.errorType = errorType;
    }


    @Override
    public String getErrorCode(){
        return this.errorType.getErrorCode();
    }

    @Override
    public String[] getErrorParas(){
        return this.errorType.getErrorParas();
    }
}
