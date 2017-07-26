package t20170703;

import java.io.IOException;
import java.rmi.ServerException;

public class LearnException {

	public static void main(String[] args) throws InterruptedException{
		System.out.println(test());
	}

	private static void doSomething() {
		try {
			throw new IOException("adadsf");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void doSthElse() throws InterruptedException{
		throw new InterruptedException("我被打断了");
	}
	public static int test(){
		try{
			int total=300;
			int count=0;
			int avg=total/count;
//			doSthElse();
			System.out.println(avg);
			System.out.println("hello world");
		}catch(ArithmeticException e){
			Throwable se=new ServerException("database eror");
			se.initCause(e);
			throw se;
		}finally{
			System.out.println("wbx");
			return 2;
		}
	}
}
