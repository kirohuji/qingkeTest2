package override;

public class Execute {

	public static void main(String[] args) {
		System.out.println("宠物的自白");
		Dog dog=new Dog();
		dog.show();
		dog.showName();
		// TODO Auto-generated method stub
		System.out.println("宠物的自白");
		Animal cat=new Cat();
		cat.show();
		cat.showType();
		Student a=new Student(1,"郑勇达",19);
		Student b=a;
		Student d=new Student(1,"郑勇达",19);
		Student c=new Student(2,"吴敏",20);
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a.equals(d));
		System.out.println(a.equals(cat));
	}
}