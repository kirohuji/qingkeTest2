package override;

public class Cat extends Animal {
	private int count;
	
	@Override
	public void show() {
		System.out.println("�ҵ����ֽ�ŷŷ,�ҵĽ���ֵ��"+count+"���Һ����˵����̶ܳ���0.");
	}

	@Override
	public void showType() {
		System.out.println("�ҵ��Ա���Q��");
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
