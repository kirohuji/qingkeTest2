package t20170706;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("localhost", 10086);
			BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			BufferedWriter output = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while (true) {
				Scanner sc = new Scanner(System.in);
				String clientMsg = sc.nextLine();
				output.write(clientMsg + "\n");
				output.flush();
				String str=input.readLine();
				System.out.println("server:"+str+"\n");
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
			System.out.println("½áÊø");
		}

	}
}
