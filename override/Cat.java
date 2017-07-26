package override;

public class Cat extends Animal {
	private int count;
	
	@Override
	public void show() {
		System.out.println("我的名字叫欧欧,我的健康值是"+count+"，我和主人的亲密程度是0.");
	}

	@Override
	public void showType() {
		System.out.println("我的性别是Q妹");
	}
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public void eat(String name) {
		
		super.eat(name);
	}

}
