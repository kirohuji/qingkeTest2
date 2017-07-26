package t20170705;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOText {
	public static void main(String[] args) {
		String filePath = "D:\\text.txt";

		File file = new File(filePath);
		if (file.exists()) {
			file.delete();
		} else {
			try {
				file.createNewFile();
				FileWriter writer = new FileWriter(filePath, true);
				BufferedWriter bw=new BufferedWriter(writer);
				bw.write("Ö£ÓÂ´ï");
				bw.newLine();
				bw.flush();
				bw.close();
				FileReader reader=new FileReader(filePath);
				BufferedReader br=new BufferedReader(reader);
				String line=br.readLine();
				while(line!=null){
					System.out.println(line);
					line=br.readLine();
				}
				br.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}

	}
}
