package override;

public class Car {
	private Tyre tyre;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Tyre getTyre() {
		return tyre;
	}

	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}
	public void printCarInfo(){
		System.out.println("汽车的名字"+name);
		System.out.println("汽车的轮胎"+tyre.getName());
	}
}
