package t20170702;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest {
	public static void main(String[] args){
		Vector<Integer> vec=new Vector<>();
		vec.add(1);
		vec.add(2);
		vec.add(3);
		vec.set(2, 5);
		System.out.println(vec.indexOf(5));
		System.out.println(vec.lastIndexOf(5));
		System.out.println(vec.firstElement());
		System.out.println(vec.elementAt(2));
		System.out.println(vec.lastElement());
		System.out.println(vec.size());
		System.out.println(vec.capacity());
		System.out.println(vec.subList(1, 2));
		Enumeration<Integer> enu=vec.elements();
		while(enu.hasMoreElements())
			System.out.println("nextElement():"+enu.nextElement());
		Integer[] v=new Integer[vec.size()];
		v=vec.toArray(new Integer[0]);
		for(Integer i:v){
			System.out.println(i);
		}
	}
}
