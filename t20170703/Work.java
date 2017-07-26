package t20170703;

import java.util.ArrayList;

public class Work {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<?> abc=new ArrayList<>();
		long starttime=System.currentTimeMillis();
		Thread cThread=new Thread(new Downloding());
		Thread dThread=new Thread(new CodingThread());
		cThread.start();
		dThread.start();
		long endtime=System.currentTimeMillis();
		System.out.println(endtime-starttime);
	}
}
