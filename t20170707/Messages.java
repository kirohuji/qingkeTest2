package t20170707;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Messages implements Runnable {
	private static ArrayList<BufferedWriter> lists = null;
	private LinkedList<String> messages = null;

	// private
	public Messages() {
		messages = new LinkedList<String>();
		lists=new ArrayList<BufferedWriter>();
	}

	@Override
	public void run() {
		while (true) {
			String message = getMessage();
			//System.out.println(message);
			Iterator<BufferedWriter> it=lists.iterator();
			while(it.hasNext()){
				BufferedWriter br=it.next();
				try {
					br.write(message+"\n");
					br.flush();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
	}

	public synchronized String getMessage() {
		while (messages.size() == 0 || messages.isEmpty()) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return messages.removeLast();

	}

	public synchronized void putMessage(String message) {
		messages.addFirst(message);
		notify();
	}
	public void add(BufferedWriter bw){
		lists.add(bw);
	}
}
