package t20170706;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AddPencilsTest {
	FirstDayAtSchool school;
	String[] bag={"Books","Notebooks","Pens"};
	@Before
	public void setup(){
		school=new FirstDayAtSchool();
	}
	@Test
	public void testPrepareMyBag(){
		System.out.println("Inside testPrepareMyBag()");
		Assert.assertArrayEquals(bag,school.prepareMyBag());
	}
}
