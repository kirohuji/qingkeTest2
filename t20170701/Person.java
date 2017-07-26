package t20170701;

public class Person implements Cloneable{
	private int age;
	private String name;
	public Person(int age,String name){
		this.age=age;
		this.name=name;
	}
	public Person(){
		
	}
	public int getAge(){
		return age;
	}
	public String getName(){
		return name;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
