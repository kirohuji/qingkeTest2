package t20170704;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorHttp {
	ExecutorService executor=Executors.newFixedThreadPool(3);
	public void start(int port) throws IOException{
		final ServerSocket ss=new ServerSocket(port);
		while(!executor.isShutdown()){
			//executor.submit(new TinyHttpdConnection(ss.accept()));
		}
	}
	public void shutdown() throws InterruptedException{
		executor.shutdown();
		executor.awaitTermination(30, TimeUnit.SECONDS);
		executor.shutdownNow();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new ExecutorHttp().start(Integer.parseInt());
	}
	
}
