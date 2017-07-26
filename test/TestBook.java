package test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestBook {
	private Book book1;
	private Book book2;
	private Book book3;
	
	@Before
	public void setup(){
		book1=new Book("书本1",new Author("郑勇达","123@qq.com",'男'),100.0,20);
		book2=new Book("书本2",new Author("郑勇达","123@qq.com",'男'),100.0,10);
		book3=new Book("书本3",new Author("无名氏","123@qq.com",'男'),100.0,10);
	}
	@Test
	public void BookCloneTest(){
		Book book4=(Book) book1.clone();
		
		if(book1==book4){
			System.out.println("Book相等");
		}else{
			System.out.println("Book不相等");
			
		}
		if(book1.getAuthor()==book4.getAuthor()){
			System.out.println("Author相等");
		}else{
			System.out.println("Author不相等");
		}
	}
	@Test
	public void BookEqualsTest(){
		Book book4=new Book("书本1",new Author("无名氏","123@qq.com",'男'),100.0,10);
		Book book5=new Book("书本1",new Author("无名氏","1234@qq.com",'男'),100.0,10);
		Assert.assertEquals(book1, book4);
		Assert.assertEquals(book1, book5);
	}
	@Test
	public void BookHashSetTest(){
		Set<Book> books=new HashSet<>();
		books.add(new Book("书本1",new Author("郑勇达","123@qq.com",'男'),100.0,20));
		books.add(new Book("书本2",new Author("无名氏","12345@qq.com",'男'),100.0,20));
		books.add(new Book("书本1",new Author("郑勇达","123@qq.com",'男'),100.0,20));
		books.add(new Book("书本1",new Author("无名氏","123@qq.com",'男'),100.0,20));
		books.add(new Book("书本3",new Author("郑勇达","123@qq.com",'男'),100.0,20));
		books.add(new Book("书本1",new Author("无名氏","1234@qq.com",'男'),100.0,20));
		Iterator<Book> its=books.iterator();
		while(its.hasNext()){
			Book book=its.next();
			System.out.println(book);
		}
	}
}
