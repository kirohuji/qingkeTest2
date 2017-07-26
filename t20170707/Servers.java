package t20170707;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Servers {
	private static ArrayList<Socket> lists = null;
	private static Messages messages;

	public static void main(String[] args) {
		start();
	}

	// 开启服务器端
	public static void start() {
		try {
			ServerSocket service = new ServerSocket(10086);
			//开启消息队列
			startMessages(messages);
			while (true) {
				Socket socket = null;
				socket = service.accept();
				startConnection(socket, messages);
			}
		} catch (IOException e) {
			// System.out.println("创建服务器失败,端口被占");
			e.printStackTrace();
		}
	}

	// 开始一个新的连接
	public static void startConnection(Socket socket,Messages messages) {
		//lists.add(socket);
		Thread client = new Thread(new Handler(socket,messages));
		client.start();
	}

	public static void startMessages(Messages message){
	    messages=new Messages();
		Thread thread=new Thread(messages);
		thread.start();
    }
	
}
