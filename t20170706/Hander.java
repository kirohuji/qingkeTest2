package t20170706;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Hander implements Runnable {
	private Socket socket;

	public Hander(Socket socket) {
		this.socket = socket;
	}

	public void run() {
		try {
			System.out.println("ÐÂßB½Ó:" + socket.getInetAddress() + ":" + socket.getPort());
			BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			BufferedWriter output = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while (true) {
				
				String clientMsg = input.readLine();
				System.out.println("client:" + clientMsg);
				Scanner sc = new Scanner(System.in);
				String serverMsg = sc.nextLine();
				output.write(serverMsg + "\n");
				output.flush();
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				System.out.println("êPé]ßB½Ó:" + socket.getInetAddress() + ":" + socket.getPort());
				if (socket != null) {
					socket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
