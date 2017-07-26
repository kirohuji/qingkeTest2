package zydPc;

import java.util.ArrayList;
import java.util.List;

import zydCalr.ProductionExpression;

public class Producer implements Runnable {
	private Repository repository;
	public Producer(Repository repository){
		this.repository=repository;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			repository.putMessage();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
