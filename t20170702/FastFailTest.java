package t20170702;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author Administrator
 *
 */
public class FastFailTest {
	private static List<String> list=new CopyOnWriteArrayList<String>();
	public static void main(String[] arg){
		new ThreadOne().start();
		new ThreadTwo().start();
	}
	private static void printAll(){
		System.out.println();
		String value=null;
		Iterator iter=list.iterator();
		while(iter.hasNext()){
			value=(String)iter.next();
			System.out.print(value+", ");
		}
	}
	private static class ThreadOne extends Thread{
		public void run(){
			int i=0;
			while(i<6){
				list.add(String.valueOf(i));
				printAll();
				i++;
			}		
		}
	}
	private static class ThreadTwo extends Thread{
		public void run(){
					int i=10;
					while(i<16){
						list.add(String.valueOf(i));
						printAll();
					    i++;
					}
		}
	}
}
