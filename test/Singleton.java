package test;

public class Singleton {
	//��¼�ж����˴�
	private int total=0;
	private static Singleton singleton=new Singleton();
	private Singleton(){
		
	}
	public void daka(){
		total++;
		System.out.println("һ����"+total+"�˴�");
	}
	//�ṩ��������getInstance������ͳһ��ʵ��
	public static Singleton getIntance(){
		
		return singleton;
		
	}
}
