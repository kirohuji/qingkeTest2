package override;

public class Execute {

	public static void main(String[] args) {
		System.out.println("������԰�");
		Dog dog=new Dog();
		dog.show();
		dog.showName();
		// TODO Auto-generated method stub
		System.out.println("������԰�");
		Animal cat=new Cat();
		cat.show();
		cat.showType();
		Student a=new Student(1,"֣�´�",19);
		Student b=a;
		Student d=new Student(1,"֣�´�",19);
		Student c=new Student(2,"����",20);
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a.equals(d));
		System.out.println(a.equals(cat));
	}
}