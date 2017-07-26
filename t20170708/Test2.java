package t20170708;

public class Test2 {

	public Test2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String a = "100";

		for (int i = 0; i < 10; i++) {
			Count1 c = new Count1(a);
			c.start();
		}
	}

}

class Count1 extends Thread {
	private String t;

	public Count1(String t) {
		this.t = t;
	}

	public void run() {
		t = t + "100";
		System.out.println(Thread.currentThread().getName() + ":" + t);
	}
}