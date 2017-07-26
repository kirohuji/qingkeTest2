package override;

public class CarBuilder {
	public static void main(String args[]){
		buildPosrche();
		buildFalali();
	}
	public static void buildPosrche(){
		Car c=new Car();
		c.setName("保时捷");
		Tyre t=new GoodTyre();
		t.setName("豪车轮胎");
		c.setTyre(t);
		c.printCarInfo();
	}
	public static void buildFalali(){
		Car c=new Car();
		c.setName("法拉利");
		Tyre t=new NoramlTyre();
		t.setName("普通轮胎");
		c.setTyre(t);
		c.printCarInfo();
	}
}
