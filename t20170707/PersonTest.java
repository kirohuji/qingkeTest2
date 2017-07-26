package t20170707;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;

public class PersonTest {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		String str="t20170707.Person";
		Person p = new Person();
		Class person1=p.getClass();
		Class person2=Person.class;
		Class<Person> person3=(Class<Person>) Class.forName(str);
		Person p1=(Person) person1.newInstance();
		Constructor c=person2.getConstructor();
		Person p2=(Person) c.newInstance();
		System.out.println(person1);
		System.out.println(person2);
		System.out.println(person3);
		System.out.println(p1);
		System.out.println(p2);
		Field name=Person.class.getDeclaredField("name");
		name.setAccessible(true);
		name.set(p1, "王宝贤大手笔");
		name.get(p1);
		int perms=name.getModifiers();
		System.out.println(Modifier.isPublic(perms));
		System.out.println(p1.getName());
		Method method=Person.class.getDeclaredMethod("setName",new Class[]{String.class});
		method.invoke(p1,new Object[]{"郑勇达"});
		System.out.println(p1.getName());
		Class<?>[] paramClasses=method.getParameterTypes();
		for(Class<?> class1:paramClasses){
			System.out.println(class1.getName());
		}
		//System.out.println(method.getParameterTypes());
	    Field fAge=Person.class.getDeclaredField("age");
	    fAge.setAccessible(true);
	    fAge.set(p1, 19);
	    System.out.println(fAge.get(p1));
	    Method[] methods=Chinese.class.getDeclaredMethods();
	    for(Method method1:methods){
	    	System.out.println(method1.getName());
	    }
	    int perm=Chinese.class.getModifiers();
	    Method[] methods2=Chinese.class.getMethods();
	    ArrayList<Method> lists=new ArrayList<>();
	    for(Method method1:methods2){
	    	if(Modifier.isPublic(perm)){
	    		lists.add(method1);
	    	}
	    }
	    System.out.println();
	    Iterator<Method> it=lists.iterator();
//	    while(it.hasNext()){
//	    //	System.out.println(it.next());
//	    }
	    Chinese wc=new Chinese();
	    Class<?> superClass=wc.getClass().getSuperclass();
	    while(superClass!=null){
	    	System.out.println(superClass.getName());
	    	superClass=superClass.getSuperclass();
	    }
	    Class<?>[] interfaces=wc.getClass().getInterfaces();
	    for(Class<?> class1:interfaces){
	    	System.out.println(class1.getName());
	    	if(class1.getName().equals("t20170707.Fightable")){
	    		wc.fight();
	    	}
	    	reflectPerson("t20170707.Person","zyd",20);
	    	
	    }
	    
	}
	public static void reflectPerson(String className,String name,int age){
		try {
			Class c1=Class.forName(className);
			Constructor c=c1.getConstructor(String.class,int.class);
			try {
				Person p=(Person) c.newInstance(name,age);
				System.out.println(p.getAge()+p.getName());
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
