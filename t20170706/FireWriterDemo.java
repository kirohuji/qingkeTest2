package t20170706;

import java.io.FileWriter;
import java.io.IOException;

public class FireWriterDemo {

	public static void main(String[] args) {
		try {
			FileWriter fw=new FileWriter("D:\\zyd\\zyd.txt");
			fw.write("hello world!");
			fw.flush();
			fw.write("first_test");
			fw.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
