package com.vanseed.saturn.core.mvc;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * http请求
 *
 * @author leon
 * @date 2018/10/29
 * @copyright vanseed
 */
public interface IRequest<T> {

	public HttpServletRequest getWrappedRequest();

	public T getRequestHeader();

	public Map getRequestParams();

}