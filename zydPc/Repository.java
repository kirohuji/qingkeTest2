package zydPc;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Repository {
	static final int MAXQUEUE = 5;
	private List<String> messages = new ArrayList<String>();
	public synchronized void putMessage(){
		while(messages.size()>=MAXQUEUE){
			System.out.println("倉庫滿了");
			try{
				wait();	
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH-mm");
		messages.add(sdf.format(new Date()));
		System.out.println("倉庫貨物加一");
		notify();
	}
	public synchronized String getMessage() {
		while (messages.size() == 0) {
			System.out.println("倉庫沒貨了");
			try {
				notify();
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		String message = (String) messages.remove(0);
		System.out.println("倉庫貨物減一");
		notify();
		return message;
	}
}
