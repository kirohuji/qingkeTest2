package t20170703;

public class Downloding implements Runnable {
	public void run() {
		long starttime = System.currentTimeMillis();
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("正在下载" + i + "部电影");
			}
		}

		long endtime = System.currentTimeMillis();
		System.out.println("downloding" + (endtime - starttime));
	}
}
