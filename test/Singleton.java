package test;

public class Singleton {
	//记录有多少人打卡
	private int total=0;
	private static Singleton singleton=new Singleton();
	private Singleton(){
		
	}
	public void daka(){
		total++;
		System.out.println("一共有"+total+"人打卡");
	}
	//提供方法比如getInstance来返回统一的实例
	public static Singleton getIntance(){
		
		return singleton;
		
	}
}
