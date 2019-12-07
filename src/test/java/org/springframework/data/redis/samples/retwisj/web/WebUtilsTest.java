package org.springframework.data.redis.samples.retwisj;

import junit.framework.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.springframework.data.redis.samples.retwisj.WebUtils;

public class WebUtilsTest {
/*
	final static long millisIn2019 = 1575727244556; 

  	@Test
	public void testAt2pm() {
		assertEquals( WebUtils.timeInWords(millisIn2019), "time.hours#" );
	}
*/

	@Test
	public void testNow() {
		assertEquals( WebUtils.timeInWords(System.currentTimeMillis()), "time.now" );
	}
}