package t20170705;

import java.io.File;
import java.net.URI;

public class LearnIO2 {
	public static void main(String[] args){
		String filePath4Windows = "D:\\zyd";
		craeateFolder(filePath4Windows);
	}

	private static void craeateFolder(String filePath4Windows) {
		// TODO Auto-generated method stub
		File folder=new File(filePath4Windows);
		folder.mkdir();
		System.out.println(folder.isDirectory());
		System.out.println(folder.isHidden());
		for(int i=1;i<10;i++){
			createFile(folder.getAbsolutePath()+"\\"+i);
		}
		for(String fileName:folder.list()){
			System.out.println(fileName);
			File file=new File(folder.getAbsolutePath()+"\\"+fileName);
			URI fileString=file.toURI();
			System.out.println(fileString.toString());
		}
	}

	private static void createFile(String string) {
		// TODO Auto-generated method stub
		
	}
}
