package t20170702;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.ListIterator;

public class ArrayTest {
	public static void main(String[] args){
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(2);
		list.add(3);
		list.add(4);
		ListIterator<Integer> it=list.listIterator();
		Integer i=it.next();
		it.set(1);
		//it.add(1);
		it.nextIndex();
		
		System.out.println(list);
	}
	
	public static <T extends Comparable&Serializable> T getMiddle(T... a){
		return a[a.length/2];
	}
}
