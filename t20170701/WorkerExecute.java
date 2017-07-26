package t20170701;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class WorkerExecute {
	public static void main(String[] args){
		Set<Worker> workers=new TreeSet<Worker>((Worker w1,Worker w2)->{
			if(w1.age==w2.age){
				if(w1.salary==w2.salary){
					return w1.name.compareTo(w2.name);
				}else if(w1.salary>w2.salary){
					return 1;
				}else{
					return -1;
				}
			}
			if(w1.age>w2.age){
				return 1;
			}else{
				return -1;
			}
		});
		workers.add(new Worker("whd",20,2000.0));
		workers.add(new Worker("wzy",21,4500.0));
		workers.add(new Worker("sjh",19,4000.0));
		workers.add(new Worker("zyd",19,6000.0));
		workers.add(new Worker("ssd",19,6000.0));
		workers.add(new Worker("ztd",19,6000.0));
		workers.add(new Worker("zsd",19,6000.0));
		
//		workers.add(1,new Worker("wbx",29,1500.0));
//		workers.remove(1);
//		for(Worker worker:workers){
//			System.out.println(worker.toString());
//			worker.work();
//		}
//		System.out.println(workers.get(6).equals(workers.get(5)));
//		Iterator<Worker> it=workers.iterator();
//		while(it.hasNext()){
//			Worker worker=it.next();
//			System.out.println(worker.toString());
//			worker.work();
//		}
//		lit.add(new Worker("whd",20,2000.0));
//		lit.add(new Worker("as",24,6000.0));
		System.out.println(workers.isEmpty());
		for(Worker worker:workers){
			if(worker.getName().equals("sjh")){
				workers.add(new Worker("wbx",29,1500.0));
				break;
			}
		}
		Iterator<Worker> it=workers.iterator();
		while(it.hasNext()){
			Worker worker=it.next();
			System.out.println(worker.toString());
			worker.work();
		}
		
	}
	static class AgeComparator implements Comparator<Worker>{

		@Override
		public int compare(Worker o1, Worker o2) {
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
}
