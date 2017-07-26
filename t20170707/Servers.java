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

	// ������������
	public static void start() {
		try {
			ServerSocket service = new ServerSocket(10086);
			//������Ϣ����
			startMessages(messages);
			while (true) {
				Socket socket = null;
				socket = service.accept();
				startConnection(socket, messages);
			}
		} catch (IOException e) {
			// System.out.println("����������ʧ��,�˿ڱ�ռ");
			e.printStackTrace();
		}
	}

	// ��ʼһ���µ�����
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
