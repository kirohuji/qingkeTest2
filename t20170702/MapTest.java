package t20170702;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		Map<Integer, FootBall> periods = new HashMap<>();
		periods.put(1, new FootBall("1930", "乌拉圭"));
		periods.put(2, new FootBall("1934", "意大利"));
		periods.put(3, new FootBall("1938", "意大利"));
		periods.put(4, new FootBall("1950", "乌拉圭"));
		periods.put(5, new FootBall("1954", "德国"));
		periods.put(5, new FootBall("1958", "巴西"));
		System.out.println(periods.containsKey(5));
		for (Map.Entry<Integer, FootBall> period : periods.entrySet()) {
			Set<String> str2 = period.getValue().worldCup.keySet();
			if (str2.contains(str)) {
				System.out.println(period.getValue().worldCup.get(str));
				break;
			} else {
				System.out.println("没有");
				break;
			}
		}

	}

	private static class FootBall {
		private Map<String, String> worldCup = new HashMap<>();

		public FootBall(String i, String s) {
			super();
			this.worldCup.put(i, s);
		}
	}

}
