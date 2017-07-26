package t20170706;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Handler;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		service();
	}

	public static void service() {
		try {
			ServerSocket serverSocket = new ServerSocket(10086);
			while (true) {
				Socket socket = null;
				socket = serverSocket.accept();
				Thread workThread = new Thread(new Hander(socket));
				workThread.start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
