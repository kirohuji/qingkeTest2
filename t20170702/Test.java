package t20170702;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
	public static void main(String[] args){
		List<Integer> list=new ArrayList<>();
		for(int i=1;i<10;i++){
			list.add(i);
			list.add(i);
			list.add(i);
		}
		System.out.println(list);
		System.out.println(dealRe(list));
	}
	public static <T> List<T> deal(List<T> list,int n){
		list.remove(n-1);
		return list;
		
	}
	public static <T> List<T> dealRe(List<T> list){
		List<T> listRe=new ArrayList<>();
		Iterator i=list.iterator();
		while(i.hasNext()){
			T t=(T) i.next();
			if(!listRe.contains(t)){
				listRe.add(t);
			}
		}
		return listRe;
		
	}
	
}
