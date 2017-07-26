package goFusanGame;

import java.lang.reflect.Field;

import org.junit.Ignore;
import org.junit.Test;

public class TestFusanGame {
	@Ignore
	@Test
	public void getVehicleTest() {
		new Thread(() -> {
			while (true) {
				AbstractVechicele.getVehicle();
			}

		}).start();
	}
	@Ignore
	@Test
	public void zombiesTest() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		City fusan = City.Fusan;
		Actor zombies = new Zombie(Zombie.class.getSimpleName());
		Field zombieSleepField=zombies.getClass().getDeclaredField("speed");
		zombieSleepField.setAccessible(true);
		int zombieSleep=zombieSleepField.getInt(zombies);
		System.out.println("speed:"+zombieSleep);
		System.out.println(zombies.go(fusan));
	}
	@Test
	public void personTest() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		City fusan = City.Fusan;
		Actor persons = new Person(Person.class.getSimpleName());
		Field personsSleepField=persons.getClass().getDeclaredField("speed");
		personsSleepField.setAccessible(true);
		int personsSleep=personsSleepField.getInt(persons);
		System.out.println("speed:"+personsSleep);
		System.out.println(persons.go(fusan));
	}
}
