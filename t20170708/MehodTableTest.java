package t20170708;

import java.lang.reflect.Method;

public class MehodTableTest {
	public static void main(String[] args) throws Exception{
		//printTable(1,10,10,square);
//		printTable(1,10,10,sqrt);
	}
	public static double square(double x){
		return x*x;
	}
	public static void printTable(double from,double to,int n,Method f){
		System.out.println(f);
		double dx=(to-from)/(n-1);
		for(double x=from;x<=to;x+=dx){
			try{
				double y=(Double)f.invoke(null, x);
				System.out.printf("%10.4f|%10.4%n",x,y);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
