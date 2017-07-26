package animal;

public class ObjectRef {
	public static void main(String[] args) {
		A b=new B();
		b.display();
	}

}

class A {
	int a = 11;
	double d = 2.0;

	void display() {
		System.out.println("Class A: a=" + a + "\td=" + d);
	}
}

class B extends A {
	float a = 3.0f;
	String d = "Java program.";

	void display() {
		super.display();
		System.out.println("Class B: a=" + a + "\td=" + d);
	}
}
