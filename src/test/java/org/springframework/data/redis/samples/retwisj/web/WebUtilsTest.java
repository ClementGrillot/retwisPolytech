package org.springframework.data.redis.samples.retwisj;

import junit.framework.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.springframework.data.redis.samples.retwisj.web.WebUtils;

public class WebUtilsTest {


	@Test
	public void testNow() {
		assertEquals( WebUtils.timeInWords(System.currentTimeMillis()), "time.now" );
	}

}