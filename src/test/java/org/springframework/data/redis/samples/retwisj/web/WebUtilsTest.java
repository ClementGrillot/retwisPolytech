package org.springframework.data.redis.samples.retwisj;
import junit.framework.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

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
		long l = System.currentTimeMillis();
		assertEquals( WebUtils.timeInWords(l), "time.now" );
	}
}