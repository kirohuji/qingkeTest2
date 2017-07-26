package t20170705;

import java.util.Date;

public class jiankong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread thread=new MyThread();
		thread.start();
		try{
			Thread.sleep(1000);
			System.out.println("²¶»ñÎ´³É¹¦");
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	public static class MyThread extends Thread{
		boolean flag=true;
		public void run(){
			while(flag){
				System.out.println("+++"+new Date()+"+++");
				try{
					sleep(1000);
				}catch(InterruptedException e){
					e.printStackTrace();
					return;
				}
			}
		}
	}
}

