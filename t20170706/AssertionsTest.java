package t20170706;
import org.junit.Test;
import static org.junit.Assert.*;
public class AssertionsTest {
	@Test
	public void test(){
		String obj1="junit";
		String obj2="junit";
		String obj3="test";
		String obj4="test";
		String obj5=null;
		int var1=1;
		int var2=2;
		int[] arithmetic1={1,2,3};
		int[] arithmetic2={1,2,3};
		assertEquals(obj1,obj2);
		assertSame(obj3,obj4);
		assertNotSame(obj2,obj4);
		assertNotNull(obj1);
		assertNull(obj5);
		assertTrue("var1�Ƚ�С",var1>var2);
		assertArrayEquals(arithmetic1,arithmetic2);
	}
}
