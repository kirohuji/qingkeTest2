package t20170707;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.ArrayList;

public class Handler implements Runnable{
	private Socket socket=null;
	private Messages messages=null;
	public Handler(Socket socket,Messages messages) {
		super();
		this.socket = socket;
		this.messages=messages;
	}
	@Override
	public void run() {
		System.out.println(socket.getInetAddress()+":"+socket.getPort());
		try {
			BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			messages.add(bw);
			while(true){
				String message =br.readLine();
				messages.putMessage(message);
				//System.out.println(message);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
