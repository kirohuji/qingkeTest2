package t20170710;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class StreamTest {
	public static void main(String[] args){
		Logger logger=LogManager.getLogger(StreamTest.class.getName());
		
		Stream stream=Stream.of("a","b","c");
		String[] strArray=new String[]{"a","b","c"};
		stream=Stream.of(strArray);
		stream=Arrays.stream(strArray);
		List<String> list=Arrays.asList(strArray);
		stream=list.stream();
		stream.forEach(System.out::println);
		List<String> output=Stream.of("a","b","c","d").map(String::toUpperCase).limit(2).collect(Collectors.toList());
		output.forEach(System.out::println);
		new Thread(()->{
			System.out.println("wbx");
		}).start();
		logger.info("Õı±¶œÕ¥Û ÷± ");
		logger.debug("zyd");
	}
}
