package override;

public final class SubCompany extends Company{
	@Override
	public void hire(){
		System.out.println("子公司自己的招聘方式");
	}

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		super.sell();
	}
	public static int countCompanyNumber(){
		return 10;
		
	}
}
