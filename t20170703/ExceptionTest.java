package t20170703;

import java.io.PrintWriter;
import java.io.StringWriter;

public class ExceptionTest {
	public static void main(String[] args){
		Throwable t=new Throwable();
		StringWriter out=new StringWriter();
		t.printStackTrace(new PrintWriter(out));
		String desription =out.toString();
		System.out.println(desription);
	}
	public static void getCustomerInfo(){
		try{
		
			System.out.println("IOException");
		}catch(Exception ex){
			System.out.println("Exception");
		}
	}
	public static int divide(int a,int dividedBy) throws DividByZeroException{
		if(dividedBy==0){
			throw new DividByZeroException("³ýÊýÎªÁã");
		}
		return a/dividedBy;
	}
	public static class DividByZeroException extends ArithmeticException{
		public DividByZeroException(String message){
			super(message);
		}
	}
}
