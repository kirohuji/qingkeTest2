package test;

import java.lang.reflect.Field;

public class TestReflect {
	private int a=3;
	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException{
		TestReflect testReflect=new TestReflect();
		System.out.println(testReflect.getClass().getName());
		 Class<?> class1 = null;
	        Class<?> class2 = null;
	        Class<?> class3 = null;
	        // 一般采用这种形式
	        class1 = Class.forName("test.src.test.TestReflect");
	        class2 = new TestReflect().getClass();
	        class3 = TestReflect.class;
	        System.out.println("类名称   " + class1.getName());
	        System.out.println("类名称   " + class2.getName());
	        System.out.println("类名称   " + class3.getName());
	        class3.getSuperclass();
	        class3.getInterfaces();
	        class3.getFields();
	        Field f=class3.getDeclaredField("name");
	        f.setAccessible(true);
	    }
	}

