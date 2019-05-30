package com.vanseed.saturn.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.Assert;
import org.junit.Test;
import com.vanseed.saturn.support.util.EncryptUtils;


@SuppressWarnings("restriction")
public class EncryptTest {
	private final static Logger logger = LoggerFactory.getLogger(EncryptTest.class);
	
	@Test
	public void md5Test() throws Exception {
		String encStr = EncryptUtils.MD5("admin");
		//21232f297a57a5a743894a0e4a801fc3
		logger.info("md5('admin')="+encStr);
		Assert.assertEquals( encStr, EncryptUtils.MD5("admin"));
	}
}
