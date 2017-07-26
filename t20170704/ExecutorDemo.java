package t20170704;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorDemo {

	public static void main(String[] args) {
		long period=1,delay=period;
		ScheduledExecutorService logService=Executors.newScheduledThreadPool(2);
	    Runnable hell=()->System.out.println("hali");
	    Callable call=()->2;
	    Future<?> Service=logService.scheduleAtFixedRate(hell, delay, period, TimeUnit.SECONDS);
//	    Service.cancel(false);
	    List<String> list=Arrays.asList("zyd","wbx");
	    list.stream().map((cast)->cast+"1").forEach((a)->System.out.println(a));
//	    CompletionService cService=new ExecutorCompletionService(logService);
	    Executor exe=Executors.newFixedThreadPool(3);
	    CompletionService<Integer> cService=new ExecutorCompletionService<>(exe);
	    cService.submit(call);
	    Future<Integer> result = null;
		try {
			result = cService.take();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    try {
			System.out.println(result.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
