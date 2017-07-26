package t20170701;

import java.util.Map;
import java.util.TreeMap;

public class Test {
	static enum Gender{
		Ů,
		��
	}
	public static void main(String[] args){
		Map<String,Student> students=new TreeMap<>((o1,o2)->{
			return o1.compareTo(o2);
		});
		students.put("zyd", new Student("֣�´�",Gender.��));
		students.put("wbx", new Student("������",Gender.Ů));
		for(Map.Entry<String, Student> entry:students.entrySet()){
			System.out.println(entry.getKey()+"��Ӧ��ѧԱ������: "+entry.getValue().name+":�Ա��� "+entry.getValue().gender);
		}
		
	}
	static class Student{
		private String name;
		private Gender gender;
		public Student(String name, Gender Ů) {

			this.name = name;
			this.gender = Ů;
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
