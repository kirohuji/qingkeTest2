package t20170712;

import java.util.concurrent.CountDownLatch;

public class LockTest {
	public static void main(String[] args) throws InterruptedException{
		CountDownLatch latch=new CountDownLatch(2);
		new Thread(()->{
//			while(true){
				System.out.println(1);
				latch.countDown();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
//			}
		}).start();
		new Thread(()->{
//			while(true){
				System.out.println(2);
				latch.countDown();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
//			}
		}).start();

		latch.await();
		
		System.out.println(3);
	}
}
