package t20170726;

import java.util.List;

import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

public interface BlogMapper {
	@Select("insert into blog(userId,title,content)value(#{userId},#{title},#{content});")
	@Options(keyProperty="id",useGeneratedKeys=true)
	public void insertBlog(Blog blog);
	@Select("select * from blog")
	public List<Blog> selectAll();
}
