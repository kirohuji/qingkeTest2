package t20170706;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.Scanner;

public class Server {
	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(10086);
			Socket socket = serverSocket.accept();
			BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			BufferedWriter output = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while (true) {
				String clientMsg = input.readLine();
				System.out.println("client:" + clientMsg);
				System.out.println("«Î ‰»Îªÿ∏¥");
				Scanner sc = new Scanner(System.in);
				String serverMsg = sc.next();
				output.write(serverMsg + "\n");
				output.flush();
				if (clientMsg.equals("bye")) {
					output.close();
					socket.close();
					input.close();
					break;
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Ω· ¯");
		}
	}
}
