package com.vanseed.saturn.core.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * description
 *
 * @author leon
 * @date 2018/10/29
 * @copyright vanseed
 */
@Target({FIELD})
@Retention(RUNTIME)
public @interface AEnum {
	Class<?> clz();
}
