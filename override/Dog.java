package override;

public class Dog extends Animal{
	private int count;
	public Dog(){
		super();
		System.out.println("���ǹ�");
	}
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public void show() {
		System.out.println("�ҵ����ֽ�ŷŷ,�ҵĽ���ֵ��"+count+"���Һ����˵����̶ܳ���0.");
	}

	@Override
	public void showName() {
		System.out.println("����һֻѩ����Ȯ��");
	}
	public void IsDog(){
		System.out.println("���ǹ�");
	}
	@Override
	public void eat(String name) {
		// TODO Auto-generated method stub
		super.eat(name);
	}
	
}
