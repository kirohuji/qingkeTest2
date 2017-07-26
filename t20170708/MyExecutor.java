package t20170708;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyExecutor {

	public MyExecutor() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService fixedThreadPool = Executors.newFixedThreadPool(5);//5¸öÏß³Ì
		for(int i = 0; i < 10 ; i++) {
			fixedThreadPool.execute(new MyRun());
		}
		fixedThreadPool.shutdown();
	}

}
