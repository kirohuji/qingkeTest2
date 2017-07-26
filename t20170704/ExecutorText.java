package t20170704;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Callable<Integer> callable=()->2+1;
		ExecutorService executor=Executors.newFixedThreadPool(3);
		Future<Integer> result=executor.submit(callable);
		
		Callable<Integer> callable1=new MyCallable();
		try {
			System.out.println(result.get());
			System.out.println(result.isDone());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Callable<Integer> callable2=Executors.callable(runnable,42);
		List<Callable<Integer>> taskList=new ArrayList<Callable<Integer>>();
		taskList.add(callable);
		taskList.add(callable1);
		ExecutorService execService=Executors.newFixedThreadPool(3);
		try {
			List<Future<Integer>> reusltList=execService.invokeAll(taskList);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println(execService.invokeAny(taskList));
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static class MyCallable implements Callable<Integer>{
		public Integer call(){
			return 2+2;
		}
	}
}
