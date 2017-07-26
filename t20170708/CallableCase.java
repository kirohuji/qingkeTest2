package t20170708;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.Callable;

public class CallableCase implements Callable<String> {

	public CallableCase() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		
		String name = Thread.currentThread().getName();
		System.out.println(name + " is running...");
		long s = getRandomSleep();
		System.out.println(name + " will sleep " + s);
		Thread.sleep(s);
		return name + " "+runtimeFmt();
	}
	
	private String runtimeFmt() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss-SSS");
		return sdf.format(new Date());
	}
	
	private long getRandomSleep() {
		Random r = new Random();
		long l = r.nextLong();
		l = Math.abs(l);
		while (l >= 30 * 1000) {
			l = l /2 ;
		}
		return l;
	}

}

