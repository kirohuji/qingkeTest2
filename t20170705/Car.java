package t20170705;

import java.util.function.Supplier;

public class Car {
	public static Car create(Supplier<Car> supplier){
		return supplier.get();
	}
	public static void collide(final Car car){
		System.out.println("Collide"+car.toString());
		
	}
	public void follow(final Car car){
		System.out.println("Following car"+car.toString());
	}
	public void repair(){
		System.out.println("Repaired car"+this.toString());
	}
	
}
