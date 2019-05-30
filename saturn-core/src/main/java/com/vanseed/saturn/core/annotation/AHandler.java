package com.vanseed.saturn.core.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * description
 *
 * @author leon
 * @date 2019/04/29
 * @copyright vanseed
 */
@Target({TYPE})
@Retention(RUNTIME)
public @interface AHandler {

	String protocol() default "000000";

	String version() default "0.0.0";
}
