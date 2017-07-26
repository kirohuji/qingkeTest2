package t20170706;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class FirstDayAtSchoolTest {
	FirstDayAtSchool school;
	String[] bag1={"Books","Notebooks","Pens"};
	String[] bag2={"Books","Notebooks","Pens","Pencils"};
	@Before
	public void setup(){
		school=new FirstDayAtSchool();
		
	}
	@Ignore
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	@Test
	public void testPrepareMyBag(){
		System.out.println("Inside testPrepareMyBag()");
		assertArrayEquals(bag1,school.prepareMyBag());
	}
	@Test
	public void testAddPencils(){
		System.out.println("Inside testAddPencils()");
		assertArrayEquals(bag2,school.addPencils());
	}

}
