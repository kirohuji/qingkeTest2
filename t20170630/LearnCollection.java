package t20170630;

import java.util.ArrayList;
import java.util.Collection;

public class LearnCollection {
	/**
	 * @param args
	 */
	public static void main(String[] args){
		Collection<String> box;
		box=new ArrayList<>();
		box.add("����");
		box.add("����");
		box.add("����");
		System.out.println(box.contains("����"));
		System.out.println(box.contains("����"));
		
	}
}
