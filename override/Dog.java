package override;

public class Dog extends Animal{
	private int count;
	public Dog(){
		super();
		System.out.println("我是狗");
	}
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public void show() {
		System.out.println("我的名字叫欧欧,我的健康值是"+count+"，我和主人的亲密程度是0.");
	}

	@Override
	public void showName() {
		System.out.println("我是一只雪娜瑞犬。");
	}
	public void IsDog(){
		System.out.println("我是狗");
	}
	@Override
	public void eat(String name) {
		// TODO Auto-generated method stub
		super.eat(name);
	}
	
}
