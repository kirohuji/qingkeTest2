package t20170704;

import java.util.ArrayList;
import java.util.List;

public class Prelude {
	public static void main(String[] arg) {
		System.out.println("��Ļ����");
		Runnable sui = new Sui();
		Thread thread = new Thread(sui);
		thread.start();
		Runnable wran = new Wran();
		Thread thread2 = new Thread(wran);
		thread2.start();
//		Fight fight = new Fight();
//		Thread thread3 = new Thread(fight);
//		thread3.start();

		
		for(int i=0;i<20;i++){
			System.out.println("������߸ھ����ڼ�ս");
			try {
				if(i==10){
					Thread thread4 = new Thread(new Cyj());
		            thread4.start();
					thread4.join();
				}
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	    
	}

	public static class Sui implements Runnable {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("������빥������");
		}

	}

	public static class Wran implements Runnable {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("�߸ھ����빥������");
		}
	}

	public static class Fight implements Runnable {

		@Override
		public void run() {
			while (true) {
				System.out.println("������߸ھ����ڼ�ս");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		public void wait2(Thread t){
			try {
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	public static class Cyj implements Runnable {

		@Override
		public void run() {
			for(int i=0;i<5;i++) {
				System.out.println("��ҧ��");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}
}
