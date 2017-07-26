package override;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Person {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void go(Person p,Moveable m){
		m.move(p);
	}
	interface Moveable{
		public void move(Person p);
	}
	public static void main(String[] args) throws CloneNotSupportedException{
		Person p1=new Person();
		p1.clone();
		p1.setAge(20);
		p1.setName("lyong");
		p1.go(p1, new Moveable(){

			@Override
			public void move(Person p) {
				System.out.println(p.getName()+"正在行动");
				
			}
		
		});
		p1.go(p1, (Person p)->{
			System.out.println(p.getName()+"正在行动!");
		});
		List<String> words=Arrays.asList("apple","banana","pear");
		words.sort((String w1,String w2)->Integer.compare(w1.length(), w2.length()));
		System.out.println(words.toString());
	}
}
