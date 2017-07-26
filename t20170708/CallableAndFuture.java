package t20170708;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableAndFuture {
	public static class MyCallable implements Callable {
		private int flag = 0;

		public MyCallable(int flag) {
			this.flag = flag;
		}

		public String call() throws Exception {
			if (this.flag == 0) {
				return "flag=0";
			}
			if (this.flag == 1) {
				try {
					while (true) {
						System.out.println("looping");
						Thread.sleep(2000);
					}
				} catch (InterruptedException e) {
					System.out.println("Interrupted");
				}
				return "false";

			} else {
				throw new Exception("Bad flag value");
			}
		}
	}
	public static void main(String[] args){
		MyCallable task1=new MyCallable(0);
		MyCallable task2=new MyCallable(1);
		MyCallable task3=new MyCallable(2);
		ExecutorService es=Executors.newFixedThreadPool(3);
		try{
			Future future1=es.submit(task1);
			System.out.println("task1:"+future1.get());
			Future future2=es.submit(task2);
			Thread.sleep(5000);
			System.out.println("task2 cancel:"+future2.cancel(true));
		    Future future3=es.submit(task3);
		    System.out.println("task3:"+future3.get());
		}catch(Exception e){
			System.out.println(e.toString());
		}
		es.shutdownNow();
	}
}
