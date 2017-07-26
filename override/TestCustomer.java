package override;

public class TestCustomer {
	public static void main(String[] args){
		System.out.println((new CustomerImpl()).sayHello("zyd"));
		System.out.println((new Customer(){

			@Override
			public String sayHello(String name) {
				// TODO Auto-generated method stub
				return "Hello,"+name;
			}
			
		}).sayHello("zyd"));
	}
}
