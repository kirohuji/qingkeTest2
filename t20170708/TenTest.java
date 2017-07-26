package t20170708;

public class TenTest {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Ten ten = new Ten(10);
			Thread thread = new Thread(ten);
			thread.start();
		}
	}

	public static class Ten implements Runnable {
		int n;

		public Ten(int n) {
			this.n = n;
		}

		public void run() {
//			try {
				n += 100;
//				while (true) {
					System.out.println(n);
//					Thread.sleep(1000);
//				}
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}
}
