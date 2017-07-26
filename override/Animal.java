package override;

public abstract class Animal {
	public Animal(){
		System.out.println("我是动物");
	}

	private int count=0;
	public void show(){
		System.out.println("我的名字叫动物,我的健康值是"+count+"，我和主人的亲密程度是0.");
	}
	public void showName(){
		System.out.println("我是动物.");
	}
	protected void showType(){
		System.out.println("我的性别是无.");
	}
	public void eat(String name){
		if(count==100){
			System.out.println("不饿了");
			
		}else{
					count+=5;
		System.out.println("我吃的是"+name);
		System.out.println("健康值增加"+5);
		}
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
}
