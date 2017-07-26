package t20170703;

public class CodingThread implements Runnable{
	public void run(){
		long starttime=System.currentTimeMillis();

		for(int i=0;i<100;i++){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("正在写第"+i+"行代码");
		}
		long endtime=System.currentTimeMillis();
		
		System.out.println("coding"+(endtime-starttime));
	}
}
