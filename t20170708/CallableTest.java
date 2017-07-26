package t20170708;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class CallableTest {
	public static void main(String[] args){
		ExecutorService executor=Executors.newFixedThreadPool(3);
		FutureTask<?> result=(FutureTask<?>) executor.submit(()->{
			System.out.println("���߳��ڽ��м���");
			Thread.sleep(3000);
			int sum=0;
			for(int i=0;i<100;i++){
				sum+=i;
			}
			return sum;
		});
		executor.shutdown();
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("���߳���ִ������");
		try {
			System.out.println("task���н��"+result.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
