package t20170726;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Ignore;
import org.junit.Test;

public class ConfigureTest {
	@Ignore
	@Test
	public void test(){
		try {
			SqlSessionFactory sqlSessionFactory=new Configure().createMyBatis();
		    SqlSession sqlSession=sqlSessionFactory.openSession();
		    BlogMapper blogMapper=sqlSession.getMapper(BlogMapper.class);
		    List<Blog> blogs=blogMapper.selectAll();
		    blogs.forEach(System.out::println);
		    User user=sqlSession.selectOne("t20170726.userMapper.selectById", 5);
		    Map blogUser=sqlSession.selectOne("t20170726.userMapper.selectUsers",5);
		    System.out.println(blogUser);
		    System.out.println(user.toString());
		    Blog blog=blogMapper.findBlogById(1);
		    System.out.println(blog);
		    sqlSession.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void UserTest(){
		SqlSessionFactory sqlSessionFactory;
		try {
			sqlSessionFactory = new Configure().createMyBatis();
			SqlSession sqlSession=sqlSessionFactory.openSession();
			User user=sqlSession.selectOne("t20170726.userMapper.selectUserss",23);
	     	System.out.println(user);
			sqlSession.commit();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
	    
	}
}
