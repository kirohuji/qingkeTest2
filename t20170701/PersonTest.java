package t20170701;

public class PersonTest {
	public static void main(String[] args){
		Person p=new Person(23,"zhang");
		try {
			Person p1=(Person)p.clone();
			String result=p.getName()==p1.getName()?
					"ǳ����":"���";
			System.out.println(result);
			System.out.println(p==p1);
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
