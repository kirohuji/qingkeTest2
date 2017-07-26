package zydCalr;

public class Consumer implements Runnable {
	Producer producer;

	Consumer(Producer producer) {
		this.producer = producer;
	}

	public void run() {
		while (true) {
			System.out.println("-------------��ʼһ����ʽ����-------------");
			String message = producer.getMessage();
			System.out.println("���ɱ��ʽ:" + message);
			Execution exe=new Execution();
			System.out.printf("������:"+"%.2f\n",exe.execute(message));
			
			
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
