package goFusanGame;

import java.util.Random;

public class Zombie extends Actor{
	private String name;
	private int speed;
	public Zombie(String name) {
		this.name=name;
		speed=(int) Math.ceil(new Random().nextDouble()*6+2);
	}
	@Override
	public String toString() {
		return "Zombie [name=" + name + ", speed=" + speed + "]";
	}
	@Override
	public int go(City city) {
		int distance=city.getDistance();
		return (int) (Math.ceil(distance/speed));
	}
	
}
