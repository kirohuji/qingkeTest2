package zydPc;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Consumer implements Runnable {
	private Repository repository;
	public Consumer(Repository repository) {
		this.repository = repository;
	}

	public void run() {
		while (true) {
			String message =repository.getMessage();
			System.out.println("获得时间:"+message);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		Repository repository=new Repository();
		
//		Producer producer = new Producer(repository);
//		new Thread(producer).start();
//		Consumer consumer = new Consumer(repository);
//		new Thread(consumer).start();
		//ExecutorService executor=Executors.newFixedThreadPool(5);
//		List<Runnable> runnables=new ArrayList<>(8);
//		
//		runnables.stream().forEach(task->{
//			int r=new Random().nextInt(3)+1;
//			if(r%2==0)
//				task=new Producer(repository);
//			else
//				task=new Consumer(repository);
//			new Thread(task).start();
////			executor.execute(task);
//		});
		new Thread(new Producer(repository)).start();
		for(int i=0;i<8;i++){
			int r=new Random().nextInt(4)+1;
			if(r%2==0)
				new Thread(new Producer(repository),String.valueOf(i)).start();
			else
				new Thread(new Consumer(repository),String.valueOf(i)).start();
		}
	}
}
