package t20170707;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class LearnReflection {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException{
		Dog dog=new Dog(null);
		getClassFullName(dog);
		getClassInstance();
		Method method=Object.class.getDeclaredMethod("clone");
		int perms=method.getModifiers();
		getObjectInstancea();
		
		
	}
	public static void getClassFullName(Dog d){
		System.out.println("1");
		Class c=d.getClass();
		System.out.println(c.getName());
		System.out.println(c.getPackage().getName());
	}
	public static void getClassInstance() throws ClassNotFoundException{
		String str="t20170707.Dog";
		Class dog1=Class.forName(str);
	//	Class d=dog1.getClass();
		System.out.println(dog1.getName());
		
	}
	public static void getClassInfo(){
		Class<Dog> dogClass=Dog.class;
		Method[] methods=dogClass.getMethods();
		Method[] methods2=dogClass.getDeclaredMethods();
		
	}
	public static void getObjectInstancea(){
		Class<Dog> dogClazz=Dog.class;
		try {
			Object o=dogClazz.newInstance();
			System.out.println(o.toString());
			Constructor c=dogClazz.getConstructor(new Class[]{String.class});
			Dog o2=(Dog)c.newInstance(new Object[]{"a"});
			System.out.println(o2);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
