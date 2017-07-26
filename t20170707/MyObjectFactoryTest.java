package t20170707;

public class MyObjectFactoryTest {

	public static void main(String[] args){
		MyObjectFactory mf=new MyObjectFactory();
		Book book=mf.<Book>getObject("t20170707.Book");
		System.out.println(book.getAge()+book.getName());
	}
//	public void initText(){
//		
//	}
}
