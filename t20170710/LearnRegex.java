package t20170710;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
@RunWith(BlockJUnit4ClassRunner.class)
public class LearnRegex {
	private Logger log=(Logger) LogManager.getLogger(LearnRegex.class.getName());
	private String[] phoneNums={"zyd1309014381@gmail.com","123-2344367"};
	private Pattern p;
	
	@Before
	public void setup(){
		//^[a-zA-Z0-9._%+-]+@(?!.*\.\..*)[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$
	    
		p=Pattern.compile("^[a-zA-Z0-9._%+-]+@(?!.*\\.\\..*)[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}$");
	}
	@Ignore
	@Test
	public void test(){
		Matcher matcher=p.matcher(phoneNums[1]);
		Assert.assertTrue("´íÎó",matcher.matches());
	}
	@Test
	public void test1(){
		Matcher matcher=p.matcher(phoneNums[0]);
		Assert.assertTrue("´íÎó",matcher.matches());
		log.debug(phoneNums[0]);
	}
}
