package animal;

public class Panda extends Animal {
	public Panda(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	public void run() {
		System.out.println(this.getKind()+ "在跑步" + age + "个月");
	}

}
