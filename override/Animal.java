package override;

public abstract class Animal {
	public Animal(){
		System.out.println("���Ƕ���");
	}

	private int count=0;
	public void show(){
		System.out.println("�ҵ����ֽж���,�ҵĽ���ֵ��"+count+"���Һ����˵����̶ܳ���0.");
	}
	public void showName(){
		System.out.println("���Ƕ���.");
	}
	protected void showType(){
		System.out.println("�ҵ��Ա�����.");
	}
	public void eat(String name){
		if(count==100){
			System.out.println("������");
			
		}else{
					count+=5;
		System.out.println("�ҳԵ���"+name);
		System.out.println("����ֵ����"+5);
		}
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
}
