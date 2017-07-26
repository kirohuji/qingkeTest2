package t20170705;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaText {
	public static void main(String[] args) {
		Car car = Car.create(Car::new);
		final List<Car> cars = Arrays.asList(car);
		cars.forEach(Car::collide);
		Stream stream = Stream.of("a", "b", "c", "a", "b", "c");
		String[] strArray = new String[] { "c", "b", "a", "a", "b", "c" };
		Integer[] intArray = new Integer[] { 1, 3, 2, 8, 6, 0 };
		Arrays.sort(intArray, Integer::compare);
		List<Integer> lists=Arrays.asList(intArray);
//		lists.forEach(System.out::println);
//		stream = Stream.of(strArray);
//
//		stream = Arrays.stream(strArray);
//		List<String> list = Arrays.asList(strArray);
//		stream = list.stream();
//		// stream.mapToInt(mapper);
//		// stream.distinct().forEach(System.out::print);
//		// stream.forEach(System.out::print);
//		// Stream.iterate(1, item -> item +
//		// 1).limit(10).forEach(System.out::print);
		List<Integer> nums = Arrays.asList(1, 1, null, 2, 3, 4, null, 5, 6, 7, 8, 9, 10);
		System.out.println("sum is:" + nums.stream().filter(num -> num != null).distinct().mapToInt(num -> num * 2)
				.peek(System.out::println).skip(2).limit(4).sum());
	}
}
