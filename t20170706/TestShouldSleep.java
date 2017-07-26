package t20170706;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestShouldSleep {
	 ShouldSleep ss=new ShouldSleep();
	/**
	 * Annotation
	 */
	@Test
	public void testShouldSleep1(){
		assertEquals(false,ss.shouldSleep(true, true));
	}
	@Test
	public void testShouldSleep2(){
		assertTrue("ÊÇÖÜÄ©",ss.shouldSleep(true, false));
	}
	@Test
	public void testShouldSleep3(){
		assertTrue(ss.shouldSleep(true, true));
	}
}
