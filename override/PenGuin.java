package override;

public class PenGuin extends Animal{
	@Override
	public void show() {
		System.out.println("我的名字叫欧欧,我的健康值是100，我和主人的亲密程度是0.");
	}

	@Override
	public void showType() {
		System.out.println("我的性别是Q妹");
	}
}
