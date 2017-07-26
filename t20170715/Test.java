package t20170715;

import java.lang.reflect.Array;

public class Test {
	public static void main(String[] args){
		Object newArray=Array.newInstance(String.class, 3);
		System.out.println(newArray.toString());
	}
}
