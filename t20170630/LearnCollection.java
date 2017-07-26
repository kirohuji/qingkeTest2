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
		box.add("张三");
		box.add("李四");
		box.add("王五");
		System.out.println(box.contains("张三"));
		System.out.println(box.contains("李四"));
		
	}
}
