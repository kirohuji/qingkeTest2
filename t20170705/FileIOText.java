package t20170705;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileIOText {
	public static void main(String[] args){
		try {
			FileInputStream in=new FileInputStream("D:\\text.txt");
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}
}
