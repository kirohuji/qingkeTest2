package t20170701;

import java.util.Map;
import java.util.TreeMap;

public class Test {
	static enum Gender{
		女,
		男
	}
	public static void main(String[] args){
		Map<String,Student> students=new TreeMap<>((o1,o2)->{
			return o1.compareTo(o2);
		});
		students.put("zyd", new Student("郑勇达",Gender.男));
		students.put("wbx", new Student("王宝贤",Gender.女));
		for(Map.Entry<String, Student> entry:students.entrySet()){
			System.out.println(entry.getKey()+"对应的学员姓名是: "+entry.getValue().name+":性别是 "+entry.getValue().gender);
		}
		
	}
	static class Student{
		private String name;
		private Gender gender;
		public Student(String name, Gender 女) {

			this.name = name;
			this.gender = 女;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Gender getGender() {
			return gender;
		}
		public void setGender(String gender) {
			gender = gender;
		}		
	}
}
