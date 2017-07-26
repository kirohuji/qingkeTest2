package t20170705;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LearnIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "/User/zjueman/newfile.txt";
		String filePath4Windows = "D:\\newfile.txt";
		// createFile(filePath4Windows);
		System.out.println(System.getProperty("user.dir"));
		//writeToFile(filePath4Windows);
		System.out.println(filePath4Windows);
		readFromFile(filePath4Windows);
	}

	private static void readFromFile(String filePath) {
		// TODO Auto-generated method stub
		File file = new File(filePath);
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line=br.readLine();
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void writeToFile(String filePath) {
		File file = new File(filePath);
		System.out.println(file.canWrite());
		System.out.println(file.canRead());
		System.out.println(file.canExecute());
		try {
			FileWriter fw = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Íõ±¦ÏÍ²Ä»ý");
			bw.newLine();
			bw.flush();

			// fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void createFile(String filePath) {
		File file = new File(filePath);
		try {
			if (file.exists()) {
				// file.delete();
				// file.createNewFile();
				// file.isDirectory();
			} else {
				System.out.println("´´");
				file.createNewFile();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
