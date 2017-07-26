package t20170711;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OptionalTest {
	public static void main(String[] args){
		Optional empty=Optional.empty();
		System.out.println(empty.toString());
		Optional<String> name=Optional.ofNullable("sanaulla");
//		Optional<String> someNull=Optional.of(null);
//		Optional empty1=Optional.ofNullable(null);
//		System.out.println(empty1.toString());
		if(name.isPresent()){
			System.out.println(name.get());
		}
		name.ifPresent(value->{
			System.out.println("The lenght of the value is:"+value.length());
		});
		System.out.println(empty.orElse("There is no value present"));
		System.out.println(empty.orElseGet(()-> "Default value"));
		try{
			empty.orElseThrow(ValueAbsentException::new);
		}catch(Throwable ex){
			System.out.println(ex.getMessage());
		}
		Optional<String> upperName=name.map(value->value.toUpperCase());
		System.out.println(upperName.orElse("No value found"));
		upperName=name.flatMap(value->Optional.of(value.toUpperCase()));
		System.out.println(upperName.orElse("No value found"));
		//Optional<Integer> a=Optional.ofNullable();
		List<Person> list=new ArrayList<>();
		list.add(new Person("zyd",19));
		list.add(new Person("wbx",20));
		list.add(new Person("whd",20));
		list.add(new Person("whd",21));	
		list.stream().filter(a->a.age==20).forEach(a->System.out.println(a.name+a.age));
//		list.stream().forEach(System.out::println);
//		Random seed = new Random();
//		Supplier<Integer> random = seed::nextInt;
//		Stream.generate(random).limit(10).forEach(System.out::println);
//		//Another way
//		IntStream.generate(() -> (int) (System.nanoTime() % 100)).
//		limit(10).forEach(System.out::println);
	}
	static class ValueAbsentException extends Throwable{
		public ValueAbsentException(){
			super();
		}
		public ValueAbsentException(String msg){
			super(msg);
		}
		@Override
		public String getMessage(){
			return "No value present in the Optional instance";
		}
	}
	static class Person{
		private String name;
		private int age;
		
		public Person(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String toString(){
			return this.name+this.age;
		}	
	}


}
