package t20170704;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadGroupTest {

	public static void main(String[] args) {
		Thread thread =new Thread();
		thread.setName("zyd");
		thread.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println(thread.getId());
		// TODO Auto-generated method stub
	   List<Integer> list=Arrays.asList(1,2,3,4,5,6,7);
	   //list.forEach(i->System.out.println(i));
	   list.stream().map((cost)->cost+cost*.12).forEach(System.out::println);
	   Executor executor1=Executors.newFixedThreadPool(3);
	   List<Runnable> runnables=new ArrayList<>();
	   for(Runnable task:runnables)
		   executor1.execute(task);
	   ScheduledExecutorService executor=Executors.newScheduledThreadPool(5);
	   Runnable task=()->{
		   System.out.println("HeartBeat...........");
	   };
	   Callable call=()->{
		   int i=2;
		   System.out.println("call");
		return task;  
	   };
	//   executor.scheduleAtFixedRate((Runnable) call, 5, 3, TimeUnit.SECONDS);
	}

}
