package t20170701;

public class Bootstrap {

	public static void main(String[] args) {
//	   Formula formula=(a)->{
//		   return sqrt(a*100);
//	   };
		Formula formul=new Formula(){

			@Override
			public double calculate(int a) {
				return sqrt(a*100);
			}
			
		};
		System.out.println(formul.calculate(100));
	}

}
