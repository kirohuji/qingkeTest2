package t20170708;

import java.util.Random;

public class ProductionExpression {
	public static void main(String[] args){
		System.out.println("生成表达式----");
//		System.out.println(producerOpreator());
//		System.out.println(producerNumber());
		int lenght=(int)(Math.random()*10);
		if(lenght%2==0){
			lenght++;
		}
		String expression=producer(lenght);
		System.out.println(expression);
	}
	public static String producerNumber(){
		int number=(int) (Math.random()*50);
		return String.valueOf(number);
	}
	public static String producerOpreator(){
		int number=(int) (Math.random()*4);
		String[] operator={"+","-","*","/"};
		return operator[number];
	}
	public static String producer(int i){
		StringBuilder sb=new StringBuilder();
		while(i>0){
			sb.append(producerOpreator());
			sb.append(producerNumber());
			i--;
		}
		return sb.toString();
	}
	
}
