package com.vanseed.saturn.core.mvc;

import java.util.Map;

/**
 * http响应
 *
 * @author leon
 * @date 2018/10/29
 * @copyright vanseed
 */
public interface IResponse<T> {

	public Integer getStatus();

	public String getMemo();

	public Map getResult();
	//public void setResult(Map result);

	public T getResponseHeader();
	//public void setResponseHeader(T header);

}