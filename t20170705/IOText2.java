package t20170705;

import java.io.File;
import java.net.URI;

public class IOText2 {

	public static void main(String[] args) {
		String filePath = "E:\\";
		File file = new File(filePath);
		show(file);

	}

	public static void show(File file) {
		if (file.isDirectory()) {
			System.out.println(file.getAbsolutePath() + ":我是目录");
			for (String fileName : file.list()) {
				File file1 = new File(file.getAbsolutePath() + "\\" + fileName);
				show(file1);
			}
		} else {
			System.out.println(file.getAbsolutePath() + ":我是文件");

		}

	}
}
