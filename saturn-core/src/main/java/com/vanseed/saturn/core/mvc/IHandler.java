package com.vanseed.saturn.core.mvc;

/**
 * 版本处理器，针对不同移动端的版本选择相应的处理器
 *
 * @author leon
 * @date 2018/10/29
 * @copyright vanseed
 */
public interface IHandler<TReq, TRes> {

	public TRes doHandler( TReq request );

	public String getVersion();

	public String getProtocol();
}
