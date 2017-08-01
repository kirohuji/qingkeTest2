package t20170726;

import java.util.List;

import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface BlogMapper {
	@Select("insert into blog(user_id,title,content)value(#{user_id},#{title},#{content});")
	@Options(keyProperty="id",useGeneratedKeys=true)
	public void insertBlog(Blog blog);
	@Select("select * from blog")
	public List<Blog> selectAll();
	@Select("select * from blog where id=#{id}")
	@Results(value={
			@Result(property="id",column="id"),
			@Result(property="userId",column="userId"),
			@Result(property="title",column="title"),
			@Result(property="content",column="content"),
			@Result(property="author",column="user_id",javaType=User.class,
			one=@One(select="t20170726.userMapper.selectById"))			
	})
	public Blog findBlogById(int id);
}
