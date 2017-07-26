package t20170708;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLTest {
	public static void main(String[] args){
		try{
			URL url=new URL("http://server/index.html");
			BufferedReader bin=new BufferedReader(new InputStreamReader(url.openStream()));
			String line;
			url.getContent();
			URLConnection connection=url.openConnection();
			String mineType=connection.getContentType();
			InputStream in=connection.getInputStream();
			while((line=bin.readLine())!=null){
				System.out.println(line);
			}
			bin.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
