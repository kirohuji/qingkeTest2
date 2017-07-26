package override;
public class Demo{
	public static void main(String[] args){
		Out out=new Out();
		out.Print(23);
		Class e=out.getClass();
		System.out.println(e.getName());
	}
}
class Out {
	private int age=12;
	public void Print(final int x){
		class In{
			public void inPrint(){
				System.out.println(x);
				System.out.println(age);
			}
		}
		new In().inPrint();
	}
}
