package t20170705;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class WindowsText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable window = new Windows();
		Thread thread1 = new Thread(window, "1");
		Thread thread2 = new Thread(window, "2");
		Thread thread3 = new Thread(window, "3");
		thread2.start();
		thread1.start();
		thread3.start();
	}

	public static class Windows implements Runnable {
		private int i = 0;
		private Lock lock=new ReentrantLock();
		@Override
		public void run() {
			while (i < 100) {
				lock.lock();
					try {
						Thread.sleep(100);
						System.out.println(Thread.currentThread().getName() + ":" + i);
					i++;
					} catch (InterruptedException e) {
						e.printStackTrace();
					}finally{
						lock.unlock();
					}

			}

		}

	}
}
