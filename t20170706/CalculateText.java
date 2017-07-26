package t20170706;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class CalculateText {
	Calculate calculation;
	int sum;
	int testSum;
	@Before
	public void setup(){
	    calculation=new Calculate();
	    sum=calculation.sum(2, 5);
	    testSum=7;
	}
	@Test
	public void testSum(){
		System.out.println("@Test sum():"+sum+"="+testSum);
		assertEquals(sum,testSum);
	}
	@Ignore
	@Test
	public void testSum1(){
		System.out.println("@Test sum():"+sum+"="+testSum);
		assertEquals(sum,testSum);
	}
}
