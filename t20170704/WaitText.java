package t20170704;

public class WaitText {
	public static void main(String[] args){
		Thread thread=new Thread(new Wait());
//		try {
//			thread.wait();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		thread.start();
		System.out.println(6);
		
	}
	public static class Wait implements Runnable{
		public synchronized void run(){
			while(true){
				try {
					show();
					wait();
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		public synchronized void show(){
			System.out.println(5);
		}
	}
}
