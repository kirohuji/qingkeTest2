package t20170705;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Manager {
	public static void main(String[] args) throws IOException {
		int i = 0;
		List<Student> lists = new ArrayList<Student>();

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			while (i < 3) {
				String str = br.readLine();
				String[] str1 = str.split(",");
				lists.add(new Student(str1[0], Integer.valueOf(str1[1]), Integer.valueOf(str1[2]),
						Integer.valueOf(str1[3])));
				i++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		lists.sort((student1, student2) -> {
			return student1.getTotal() > student2.getTotal() ? -1 : 1;
		});
		String path = "D:\\zyd\\stud.txt";
		File file = new File(path);
		if (file.exists()) {

		} else {
			file.createNewFile();
		}
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		lists.forEach(s -> {
			try{
				bw.write(s.toString());
				bw.flush();
				System.out.println("≤Â»Î≥…π¶");
				bw.newLine();
			} catch (IOException e) {
				e.printStackTrace();
			}

		});
	}
}
