package t20170711;

import java.io.Serializable;

public class Student implements Serializable{
	private String name;
	private String grade;
	private int age;
	public Student(String name, String grade, int age) {
		super();
		this.name = name;
		this.grade = grade;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String toString(){
		return "{name: "+this.name+" grade: "+this.grade+" age: "+this.age+"}";
	}
	
}
