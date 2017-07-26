package t20170630;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ArrayListVsLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arrayList=new ArrayList<Integer>();
		List<Integer> linkedList=new LinkedList<Integer>();
		for(int i=0;i<10000;i++){
			arrayList.add(i);
			linkedList.add(i);
		}
		Pair<String> a=new Pair<>();
	} 
	@SuppressWarnings("unchecked")
	public static void testRandomAccess(){
		long start=System.currentTimeMillis();
		for(int i=0;i<10000;i++){
			Random rd=new Random();
			int index=rd.nextInt(10000);
		}
	}
	@SafeVarargs
	public static <T> void addAll(Collection<T> coll,T ...ts ){
		for(T t:ts) coll.add(t);
	}

}
