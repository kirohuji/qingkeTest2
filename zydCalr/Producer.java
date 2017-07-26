package zydCalr;

import java.util.ArrayList;
import java.util.List;

public class Producer implements Runnable {
	static final int MAXQUEUE = 5;
	private List<String> messages = new ArrayList<String>();
	private ProductionExpression pe=new ProductionExpression();

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			putMessage();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private synchronized void putMessage() {
		while (messages.size() >= MAXQUEUE) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		//生成表达式
		messages.add(pe.producerExpression());
		notify();
	}

	public synchronized String getMessage() {
		while (messages.size() == 0) {
			try {
				notify();
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		String message = (String) messages.remove(0);
		notify();
		return message;
	}

}
