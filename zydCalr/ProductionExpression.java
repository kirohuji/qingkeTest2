package zydCalr;

import java.util.Random;

public class ProductionExpression {
	public static void main(String[] args) {
		System.out.println("���ɱ��ʽ----");
		String expression = producerExpression();
		System.out.println(expression);
		Execution executor = new Execution();
		executor.execute(expression);
	}
	//������ֵ
	public static String producerNumber() {
		int number = (int) (Math.random() * 50);
		return String.valueOf(number);
	}
    //������ֵ
	public static String producerOpreator() {
		int number = (int) (Math.random() * 4);
		String[] operator = { "+", "-", "*", "/" };
		return operator[number];
	}
    //����
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
    //�������ʽ
	public static String producerExpression() {
		int lenght = (int) (Math.random() * 5);
		if (lenght % 2 == 0) {
			lenght++;
		}
		String expression = producer(lenght);
		return expression;
	}

}
