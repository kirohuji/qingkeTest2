package t20170706;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;

public class InText {

	public static void main(String[] args) throws IOException {
		InetAddress address = InetAddress.getByName("www.baidu.com");
		System.out.println(address.getHostName());
		System.out.println(address.getHostAddress());
	    System.out.println(address.getCanonicalHostName());
		System.out.println(address.getAddress());
		System.out.println(address.getLocalHost());
		URL baidu = new URL("http://www.baidu.com");
		URL url = new URL(baidu, "/index.html?username=tom#test");
		System.out.println(baidu.getProtocol());
		System.out.println(baidu.getFile());
		System.out.println(baidu.getHost());
		System.out.println(baidu.getPort());
		System.out.println(baidu.getPath());
		System.out.println(baidu.getQuery());
		System.out.println(baidu.getUserInfo());
		System.out.println(baidu.getAuthority());
		System.out.println(baidu.getRef());
		InputStream is = baidu.openStream();
		InputStreamReader isr = new InputStreamReader(is, "gbk");
		BufferedReader br = new BufferedReader(isr);
		File file = new File("D:\\zyd\\zyd.html");
		if (file.exists()) {

		} else {
			file.createNewFile();
		}
		String data = br.readLine();
		FileWriter writer = new FileWriter(file, true);
		BufferedWriter bw = new BufferedWriter(writer);
		while (data != null) {
			System.out.println(data);
			bw.write(data);
			bw.flush();
			data = br.readLine();
		}
		bw.close();
		writer.close();
		br.close();
		isr.close();
		is.close();
	}

}
