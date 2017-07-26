package zydCalr;

import java.util.Random;

public class ProductionExpression {
	public static void main(String[] args) {
		System.out.println("生成表达式----");
		String expression = producerExpression();
		System.out.println(expression);
		Execution executor = new Execution();
		executor.execute(expression);
	}
	//生成数值
	public static String producerNumber() {
		int number = (int) (Math.random() * 50);
		return String.valueOf(number);
	}
    //生成数值
	public static String producerOpreator() {
		int number = (int) (Math.random() * 4);
		String[] operator = { "+", "-", "*", "/" };
		return operator[number];
	}
    //产生
	public static String producer(int i) {
		StringBuilder sb = new StringBuilder();
		int flag = (int) (Math.random() * 5);
		
		if(flag==1){
			sb.append("-");
		}
		sb.append(producerNumber());
		while (i > 0) {
			sb.append(producerOpreator());
			sb.append(producerNumber());
			i--;
		}
		return sb.toString();
	}
    //产生表达式
	public static String producerExpression() {
		int lenght = (int) (Math.random() * 5);
		if (lenght % 2 == 0) {
			lenght++;
		}
		String expression = producer(lenght);
		return expression;
	}

}
