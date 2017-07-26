package t20170701;

public class Outer<E> {
	private static int a=10;
	public static void main(String[] args){
		Outer.Inner<String> e=new Outer.Inner<>();
		Outer.OtherInner o=new Outer.OtherInner();
		
	}
	public static class Inner<E>{
		public void show(){
			System.out.println(a);
		}
	}
	private static class OtherInner{
		public void show(){
			System.out.println(a);
		}
		
	}
}
