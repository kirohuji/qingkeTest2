package override;

public final class SubCompany extends Company{
	@Override
	public void hire(){
		System.out.println("�ӹ�˾�Լ�����Ƹ��ʽ");
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
