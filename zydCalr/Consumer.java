package zydCalr;

public class Consumer implements Runnable {
	Producer producer;

	Consumer(Producer producer) {
		this.producer = producer;
	}

	public void run() {
		while (true) {
			System.out.println("-------------开始一组表达式处理-------------");
			String message = producer.getMessage();
			System.out.println("生成表达式:" + message);
			Execution exe=new Execution();
			System.out.printf("处理结果:"+"%.2f\n",exe.execute(message));
			
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
	
		Producer producer = new Producer();
		new Thread(producer).start();
		Consumer consumer = new Consumer(producer);
		new Thread(consumer).start();
		
	}
}
