package goFusanGame;

public class Person extends Actor{
	private String name;
	private int speed=2;
	private Vehicle vehicle;
	public Person(String name) {
		this.name=name;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", speed=" + speed + "]";
	}
	@Override
	public int go(City city) {
		int distance=city.getDistance();
		vehicle=AbstractVechicele.getVehicle();
		speed+=vehicle.speedUp();
		double time=distance/speed;
		return (int) Math.ceil(time);
	}

}
