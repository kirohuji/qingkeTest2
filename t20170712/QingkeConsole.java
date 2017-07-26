package t20170712;

import java.io.InputStream;
import java.util.Scanner;

public class QingkeConsole {
	private static Scanner scanner;
	static {
		scanner=new Scanner(System.in);
	}
	private QingkeConsole(InputStream is){
		scanner=new Scanner(is);
	}
	public static String NEW_LINE="\n";
	public static void print(String line){
		System.out.println(line);
	}
	public static void println(Object object){
		System.out.println(object);
	}
	public static void println(String line){
		System.out.println(line);
	}
	public static String askUserInput(String prompt){
		while(true){
			System.out.println(prompt);
			String input=scanner.nextLine().trim();
			if(!"".equals(input)){
				return input;
			}
			System.out.println("Invalid input.Empty value is not allowed!");
		}
	}
}
