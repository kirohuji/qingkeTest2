package test;

import java.util.Arrays;
import java.util.List;

public class OuterClass{
	private String sex;
	public static String name="chenssy";
	/**
	 * 静态内部类
	 */
	static class InnerClass{
		public static String _name1="chenssy_static";
		public void display(){
			/**
			 * 静态内部类只能访问外围类的静态成员变量和方法
			 * 不能访问外围类的非静态成员变量和方法
			 */
			System.out.println("OutClass name:"+name);	
		}
	}
	class InnerClass2{
		public String _name2="chenssy_inner";
		public void display(){
			System.out.println("OuterClass name:"+name);		
		}
	}
	/**
	 * @desc 外围类方法
	 * @author chenssy
	 * @data 2017-10-25
	 * @return void 
	 */
	public void display(){
		System.out.println(InnerClass._name1);
		new InnerClass().display();
		OuterClass.InnerClass2 inner2=new OuterClass().new InnerClass2();
		System.out.println(inner2._name2);
		inner2.display();		
	}
	public static void main(String[] args){
		OuterClass outer=new OuterClass();
		outer.display();
		String[] s={"aa","bb","cc"};
		List<String> strList=Arrays.asList(s);
		
		
	}
	public void show(){
		System.out.println("zyd");
		System.out.println("wbx");
	}
}