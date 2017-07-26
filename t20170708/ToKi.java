package t20170708;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class ToKi {
	public static void main(String[] args) {
		Thread thread = new Thread(() -> {
			DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH mm ss ");
			while (true) {
				String dateString = format.format(System.currentTimeMillis());
				System.out.println(dateString);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		thread.start();
//		List<Thread> lists=new ArrayList<>();
//		lists.stream().forEach();
	}
}
