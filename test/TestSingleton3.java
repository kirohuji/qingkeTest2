package test;

public class TestSingleton3 {
	public static void main(String[] arg) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		Singleton s=Singleton.getIntance();
		Class c1=Class.forName("java.util.Date");
		Class c2=int.class;
		OuterClass a=new OuterClass();
		Class c4=a.getClass();
		Class c3=s.getClass();
		OuterClass o=a.getClass().newInstance(); 
	}
}
