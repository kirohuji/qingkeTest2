package t20170705;

import java.util.Arrays;
import java.util.List;

public class PrintStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testPrintStreamConstrutor();
		testPrintStreamAPIS();
		Text t=new Text(5,6);
		List<Integer> nums=Arrays.asList(1,null,3,4,null,6);
		System.out.println(nums.stream().filter(num->num!=null).count());
		Thread thread=new Thread(()->{
			System.out.println("ad");
		});
		thread.start();
	}
	
	
	private static void testPrintStreamAPIS() {
		// TODO Auto-generated method stub
		
	}

	private static void testPrintStreamConstrutor() {
		// TODO Auto-generated method stub

	}
	public static class Text{
		private int i;
		private int j;
		public int getI() {
			return i;
		}

		public void setI(int i) {
			this.i = i;
		}

		public int getJ() {
			return j;
		}

		public void setJ(int j) {
			this.j = j;
		}

		public Text(int i, int j) {
			super();
			this.i = i;
			this.j = j;
		}
		
	}

}
