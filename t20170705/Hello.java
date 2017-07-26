package t20170705;

public class Hello {

	public static void main(String[] args) throws InterruptedException {
		Runner r = new Runner();
		Thread t = new Thread(r);
		
		t.start();
		for(int i=0;i<2;i++){
			Thread.sleep(1000);
			System.out.print("z");
		}
		synchronized(r){
			r.notifyAll();
		}
		
	}
}

class Runner implements Runnable {
	private int count = 1;

	public synchronized void run() {
		for (int i = 0; i < 1; i++) {
			System.out.println("runner" + i);
		}
		try {
			if (count == 3) {
				notifyAll();
			} else {
				count++;
				System.out.println(count);
				wait();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}