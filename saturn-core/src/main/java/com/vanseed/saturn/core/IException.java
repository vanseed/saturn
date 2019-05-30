package com.vanseed.saturn.core;

/**
 * 封装异常信息，用于处理异常显示的国际化支持
 *
 * @author leon
 * @date 2018/10/29
 * @copyright vanseed
 */
public interface IException {

    public String getErrorCode();

    public String[] getErrorParas();
}