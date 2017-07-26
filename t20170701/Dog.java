package t20170701;
import java.lang.Comparable;
public class Dog implements Comparable<Dog>{
	public String name;
	public String owner;
	public int age;
	public Dog(String name, String owner, int age) {
		super();
		this.name = name;
		this.owner = owner;
		this.age = age;
	}
	public Dog(String name, String owner) {
		super();
		this.name = name;
		this.owner = owner;
	}
	public void print() {
	    System.out.println(name+":"+owner);
		
	}
	public int hashCode(){
		String s=name + owner;
		return s.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Dog)){
			return false;
		}
		Dog dog=(Dog)obj;
		
		return name.equals(dog.name)&&owner.equals(dog.owner);
	}
	@Override
	public int compareTo(Dog other) {
		// TODO Auto-generated method stub
		return (int)name.compareTo(other.name);
	}
	
	
}
