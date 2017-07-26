package t20170707;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Client {
	public static void main(String[] args) {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(is);

		Socket socket;
		try {
			socket = new Socket("localhost", 10086);
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			Thread thread = new Thread(() -> {
				while (true) {
					try {
						System.out.println(br.readLine());
					} catch (IOException e) {

						e.printStackTrace();
					}
				}
			});
			thread.start();
			while (true) {
				String message = in.readLine();
				bw.write(message + "\n");
				bw.flush();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
