package t20170702;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class WorkerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Worker> workers=new HashSet<>();
		workers.add(new Worker("zyd",19,10000.0,new Worker().new Address("12", "123" )));
		workers.add(new Worker("whd",20,1000.0,new Worker().new Address("12", "123" )));
		workers.add(new Worker("wbx",20,2000.0,new Worker().new Address("12", "123" )));
		workers.add(new Worker("wzy",21,3000.0,new Worker().new Address("12", "123" )));
		workers.add(new Worker("zyd",19,10000.0,new Worker().new Address("12", "123" )));
		workers.add(new Worker("whd",20,1000.0,new Worker().new Address("12", "123" )));
		workers.add(new Worker("wbx",20,2000.0,new Worker().new Address("12", "123" )));
		workers.add(new Worker("wzy",21,3000.0,new Worker().new Address("12", "123" )));
		Iterator<Worker> it=workers.iterator();
		while(it.hasNext()){
			Worker worker=it.next();
			System.out.println(worker.getName()+worker.getAge());
		}
	}

}
