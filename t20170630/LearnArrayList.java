package t20170630;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList {
	public static void main(String[] args){
		List<String> list=new ArrayList<>();
		//1.����
		list.add("asd");
		list.add("zyd");
		list.add("wbx");
		list.add("wzy");
		list.add("wzy");
		list.add("wzy");
		list.add(0, "whd");
	    list.add(20,"asdf");
		System.out.println(list.indexOf("wbx"));
		System.out.println("��ʼlist��");
		//2.����
		list.get(0);
		list.get(1);
		//3.ɾ��
		list.set(0, "asdf");
		list.remove(list.size()-1);
		
		//4.����
		for(String s:list){
			System.out.println(s);
			
		}

	}
	public static void print(List s){
		Iterator<String> t=s.iterator();
		while(t.hasNext()){
			String str=t.next();
			System.out.println(str);
		}
	}
}
