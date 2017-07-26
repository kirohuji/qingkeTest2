package goFusanGame;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.apache.log4j.Logger;

public class GoFusanGame {
	private List<City> citys;
	private static int pCount = 0;
	private static int zCount = 0;

	public static void main(String[] args) {
		Logger logger = Logger.getLogger(GoFusanGame.class);
		logger.debug(" info ");
		GoFusanGame game = new GoFusanGame();
		game.start();
	}

	public void start() {
		//初始化
		init();
		ConsolePrint.println("------开始游戏-------");

		citys.stream().forEach((city) -> {
			Actor persons = new Person(Person.class.getSimpleName());
			Actor zombies = new Zombie(Zombie.class.getSimpleName());
			int ptime = persons.go(city);
			int ztime = zombies.go(city);
			zombies.go(city);
			if (ptime <= ztime) {
				pCount++;
			} else {
				zCount++;
			}
		});
		if (pCount > zCount) {
			ConsolePrint.println("人类胜利");
		} else {
			ConsolePrint.println("僵尸胜利");
		}
		pCount = 0;
		zCount = 0;
	}

	private void init() {
		citys = new ArrayList<City>();
		citys.add(City.Fusan);
		citys.add(City.Renchuan);
		citys.add(City.Shouer);

	}
}
