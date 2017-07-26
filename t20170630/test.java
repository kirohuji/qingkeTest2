package t20170630;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Administrator
 *
 */
public class test {
	/**
	 * @param arg
	 */
	public static void main(String[] arg){
		String myString="Foo";
		Class stringClass=myString.getClass();
		Class stringClass2=String.class;
		String s="Boofa";
		Class stringClass3=s.getClass();
		System.out.println(stringClass3.getName());
		Method method = null;
		try {
			method = Object.class.getDeclaredMethod("clone");
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int perms=method.getModifiers();
		System.out.println(Modifier.isPublic(perms));
		int[] intArray={1,2,3,4,5};
		String intArrayString=Arrays.toString(intArray);
		System.out.println(intArrayString);
		String[] stringArray={"a","b","c","d","e"};
		ArrayList<String> arrayList =new ArrayList<String>(Arrays.asList(stringArray));
		//ArrayList<String> arrayList =new ArrayList<String>(Arrays.asList(stringArray));
		System.out.println(arrayList);
		boolean b=Arrays.asList(stringArray).contains("a");
		System.out.println(b);
		int[] intArray1={1,2,3,4,5};
		int[] intArray2={6,7,8,9,10};
		// Apache common lang
		boolean bool=false;
		Boolean b2=new Boolean(bool);
		Integer i=new Integer(3);
		int i2=i.intValue();
		String a="23";
		int i1=Integer.parseInt(a);
		
	}
	public class Stu{
		public Stu(){
			
		}
	}
	public static <T> T printT(T ... list){
		return null;
	}
}

