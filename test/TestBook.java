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
		book1=new Book("�鱾1",new Author("֣�´�","123@qq.com",'��'),100.0,20);
		book2=new Book("�鱾2",new Author("֣�´�","123@qq.com",'��'),100.0,10);
		book3=new Book("�鱾3",new Author("������","123@qq.com",'��'),100.0,10);
	}
	@Test
	public void BookCloneTest(){
		Book book4=(Book) book1.clone();
		
		if(book1==book4){
			System.out.println("Book���");
		}else{
			System.out.println("Book�����");
			
		}
		if(book1.getAuthor()==book4.getAuthor()){
			System.out.println("Author���");
		}else{
			System.out.println("Author�����");
		}
	}
	@Test
	public void BookEqualsTest(){
		Book book4=new Book("�鱾1",new Author("������","123@qq.com",'��'),100.0,10);
		Book book5=new Book("�鱾1",new Author("������","1234@qq.com",'��'),100.0,10);
		Assert.assertEquals(book1, book4);
		Assert.assertEquals(book1, book5);
	}
	@Test
	public void BookHashSetTest(){
		Set<Book> books=new HashSet<>();
		books.add(new Book("�鱾1",new Author("֣�´�","123@qq.com",'��'),100.0,20));
		books.add(new Book("�鱾2",new Author("������","12345@qq.com",'��'),100.0,20));
		books.add(new Book("�鱾1",new Author("֣�´�","123@qq.com",'��'),100.0,20));
		books.add(new Book("�鱾1",new Author("������","123@qq.com",'��'),100.0,20));
		books.add(new Book("�鱾3",new Author("֣�´�","123@qq.com",'��'),100.0,20));
		books.add(new Book("�鱾1",new Author("������","1234@qq.com",'��'),100.0,20));
		Iterator<Book> its=books.iterator();
		while(its.hasNext()){
			Book book=its.next();
			System.out.println(book);
		}
	}
}
