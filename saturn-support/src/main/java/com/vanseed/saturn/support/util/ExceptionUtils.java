package com.vanseed.saturn.support.util;

import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 异常工具类
 *
 * @author leon
 * @date 2018/10/29
 * @copyright vanseed
 */
public class ExceptionUtils {

    /**
     * 根据异常信息代码和异常信息参数初始化多条业务异常
     *
     * @param e 需要格式化信息的异常
     * @return RuntimeException
     */
    public static String getFormatExceptionMessage(Exception e) {
		List<String> exceptionStack = new ArrayList<String>();
		exceptionStack.add(e.getClass().getName());
		for (StackTraceElement ste : e.getStackTrace()) {
			exceptionStack.add(" at " + ste.getClassName() + "."
					+ ste.getMethodName() + "(" + ste.getFileName() + ":"
					+ ste.getLineNumber() + ")");
		}
		return StringUtils.collectionToDelimitedString(exceptionStack, "");
	}

    /**
     * 根据异常信息代码和异常信息参数初始化多条业务异常
     *
     * @param ex 需要unchecked的异常
     * @return RuntimeException
     */
    public static RuntimeException unchecked(Throwable ex)
    {
        if (ex instanceof RuntimeException)
        {
            return (RuntimeException) ex;
        }
        else
        {
            return new RuntimeException(ex);
        }
    }
}
