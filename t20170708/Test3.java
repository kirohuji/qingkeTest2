package t20170708;

public class Test3 {

	public Test3() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		Integer a = 100;
		
		for(int i = 0; i < 10; i ++) {
			Count3 c = new Count3(a);
			c.start();
		}
	}

}


class Count3 extends Thread {
	private Integer t ;
	public Count3(Integer t) {
		this.t = t;
	}
	
	public void run() {
		t = t + 100;
		System.out.println(Thread.currentThread().getName()
				+ ":" + t);
	}
}
