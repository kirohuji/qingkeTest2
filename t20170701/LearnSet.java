package t20170701;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
	public static void main(String[] args){
		Set<Dog> set=new TreeSet<>((o1,o2)->{
			
			if(o1.age==o2.age){
				return 0;
			}
			if(o1.age>o2.age){
				return 1;
			}else{
				return -1;
			}
		});
		set.add(new Dog("dog1","zyd",14));		
		set.add(new Dog("dog2","wbx",16));		
		set.add(new Dog("dog3","whd",12));		
		set.add(new Dog("dog4","wzy",18));		
		set.add(new Dog("dog5","sjh",10));		
		Iterator<Dog> it=set.iterator();
		while(it.hasNext()){
			Dog a=it.next();
			a.print();
		}

	}
	static class AgeComparator implements Comparator<Dog>{

		@Override
		public int compare(Dog o1, Dog o2) {
			if(o1.age==o2.age){
				return 0;
			}
			if(o1.age>o2.age){
				return 1;
			}else{
				return -1;
			}
		}
		
	}
	@FunctionalInterface  
	interface NameComparator extends Comparator<Dog>{
		
	}
}
