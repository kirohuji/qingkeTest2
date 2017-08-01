package t20170726;

import java.util.List;

public class Blog {
	private int id;
	private int userId;
	private String title;
	private String content;
	private User author;
	private List<Post> posts;
	public List<Post> getPosts() {
		return posts;
	}
	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public User getAuthor() {
		return author;
	}
	public void setAuthor(User author) {
		this.author = author;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Blog [id=" + id + ", userId=" + userId + ", title=" + title + ", content=" + content + ", author="
				+ author + ", posts=" + posts + "]";
	}
	
	
}
