/**
 * 
 */
package t20170703;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Invoke {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Class clas;
			try {
				clas = Class.forName("java.lang.System");
				Method method=clas.getMethod("currentTimeMillis");
			    Object ret=method.invoke(null);
			    System.out.println("Invoked static method:"+"java.lang.System"+"of class:"+"currentTimeMillis"+"with no arg\nResults:"+ret);
			} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
