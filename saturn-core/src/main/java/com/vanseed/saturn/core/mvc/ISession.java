package com.vanseed.saturn.core.mvc;


import java.io.Serializable;
import java.util.Date;

/**
 * session
 *
 * @author leon
 * @date 2019/04/29
 * @copyright vanseed
 */
public interface ISession extends Serializable {

	public String getSessionId();

	public Date getCreatTime();

	public Date getAccessTime();
}