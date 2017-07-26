package t20170726;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

public class ConfigureTest {
	@Test
	public void test(){
		try {
			SqlSessionFactory sqlSessionFactory=new Configure().createMyBatis();
		    SqlSession sqlSession=sqlSessionFactory.openSession();
		    BlogMapper blogMapper=sqlSession.getMapper(BlogMapper.class);
		    List<Blog> blogs=blogMapper.selectAll();
		    blogs.forEach(System.out::println);
		    sqlSession.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
