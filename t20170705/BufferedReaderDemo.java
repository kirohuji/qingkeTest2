package t20170705;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(System.in));
//		String text=bufferedReader.readLine();
//		System.out.println(text);
		try(BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(System.in))){
			String text=bufferedReader.readLine();
			System.out.println(text);
		}
		try(BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in))){
			String text=bufferedReader.readLine();
			System.out.println(text);
		}
	}

}
