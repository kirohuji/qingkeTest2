package override;

public class CarBuilder {
	public static void main(String args[]){
		buildPosrche();
		buildFalali();
	}
	public static void buildPosrche(){
		Car c=new Car();
		c.setName("��ʱ��");
		Tyre t=new GoodTyre();
		t.setName("������̥");
		c.setTyre(t);
		c.printCarInfo();
	}
	public static void buildFalali(){
		Car c=new Car();
		c.setName("������");
		Tyre t=new NoramlTyre();
		t.setName("��ͨ��̥");
		c.setTyre(t);
		c.printCarInfo();
	}
}
