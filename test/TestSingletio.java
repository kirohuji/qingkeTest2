package test;

public class TestSingletio {
	public static void main(String[] arg){
		Singleton s=Singleton.getIntance();
		s.daka();
		Singleton s2=Singleton.getIntance();
		s2.daka();
	}
}
