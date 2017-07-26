package t20170712;

import org.junit.Assert;
import org.junit.Test;

public class ModTest {
	@Test
	public void test(){
		Assert.assertTrue(10%2==10-(10/2)*2);
	}
}
