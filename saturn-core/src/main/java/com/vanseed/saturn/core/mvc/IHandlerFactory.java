package com.vanseed.saturn.core.mvc;

/**
 * 版本处理器，针对不同的版本选择相应的处理器
 *
 * @author leon
 * @date 2018/10/29
 * @copyright vanseed
 */
public interface IHandlerFactory<T> {

    public T getHandler(IRequest request);
}
