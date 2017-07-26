package t20170708;

public class ThreadLocalTest {
	public static void main(String[] args){
		ThreadLocal<String> tl=new ThreadLocal<String>();
	    tl.set("sss");
	    tl.get();
	}
}
