package t20170708;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		List<FutureTask<String>> list = new ArrayList<FutureTask<String>>();
//		ExecutorService es = Executors.newCachedThreadPool();
		for(int i = 0; i <= 10; i++) {
			CallableCase cc = new CallableCase();
			FutureTask<String> task = new FutureTask<String>(cc);
//			FutureTask<String> task = es.submit(cc);
			Thread t = new Thread(task);
			t.start();
			list.add(task);
		}
		for(FutureTask<String> task : list) {
			String  l = task.get();
			System.out.println("here: " + l);
		}
	}

}
