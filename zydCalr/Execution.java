package zydCalr;

import java.util.Scanner;

public class Execution {
	public double execute(String str){
		String expression = str + "+1";
		// ��ʼ����ʼ
		//
		char[] Cexpression = expression.toCharArray();
		// ����������
		Calculator calculator = new Calculator();
		// ��ֵ�б�
		double[] numbers = new double[30];
		int numbersindex = 0;
		// ת���б�
		char[] sub = new char[30];
		// ��ֵ�±�λ��
		int count = 0;
		// �����б�
		char[] symbols = new char[10];
		int symbolsindex = 0;
		// temp1����ֵ�б���һ����ֵ��temp2�ǵ�ǰ����ֵ
		double temp1 = 0, temp2 = 0;
		;
		// ����
		char symbol = 0;
		int flag = 1;
		// ��ʼ������
		// ��һ�α���
		for (int i = 0; i < expression.length(); i++) {
			if (Cexpression[i] >= '0' && sub[i] <= '9') {
				sub[count++] = Cexpression[i];
			} else {
				// �ַ���ת��double
				temp2 = transition(sub,count);
				// ��flag=2ʱ��������
				if (flag == 2) {
					flag = 1;
					// ��ȡ��ֵ�б�ǰһ����ֵ;
					temp1 = numbers[numbersindex - 1];
					// �ж�symbol�˷����ǳ���,�ɹ��ǳ˷���ʧ��Ϊ����
					if (decide(symbol)==1) {
						temp2 = calculator.multiplication(temp1, temp2);
					} else {
						temp2 = calculator.divsition(temp1, temp2);						
					}
					// ����ǰһ����ֵ
					numbersindex--;
				}
				// temp2������ֵ�б�
				numbers[numbersindex++] = temp2;
				// ��ȡ����
				symbol = Cexpression[i];
				// ת����ֵ�±�λ������
				count = 0;

				// �ж��Ƿ����flag��flag=2������������뵽�����б�
				if (judge(symbol) > flag) {
					flag = 2;
				} else {
					// ���뵽�����б�
					symbols[symbolsindex++] = symbol;
				}

			}
		}
		double temp = numbers[0];
		count = 0;
		for (int i = 1; i < numbers.length; i++) {
			if (symbols[count] == '+') {
				temp += numbers[i];
				count++;
			} else if (symbols[count] == '-') {
				temp -= numbers[i];
				count++;
			}
		}
		return temp;

	}
	public static void main(String[] args) {
		System.out.println("�������������ʽ");
		Scanner in = new Scanner(System.in);
		String expression = in.nextLine();
		expression = expression + "+1";
		System.out.println("�ڲ��ַ����ı�Ϊ" + expression);
		// ��ʼ����ʼ
		//
		char[] Cexpression = expression.toCharArray();
		// ����������
		Calculator calculator = new Calculator();
		// ��ֵ�б�
		double[] numbers = new double[30];
		int numbersindex = 0;
		// ת���б�
		char[] sub = new char[30];
		// ��ֵ�±�λ��
		int count = 0;
		// �����б�
		char[] symbols = new char[10];
		int symbolsindex = 0;
		// temp1����ֵ�б���һ����ֵ��temp2�ǵ�ǰ����ֵ
		double temp1 = 0, temp2 = 0;
		;
		// ����
		char symbol = 0;
		int flag = 1;
		// ��ʼ������
		// ��һ�α���
		for (int i = 0; i < expression.length(); i++) {
			if (Cexpression[i] >= '0' && sub[i] <= '9') {
				sub[count++] = Cexpression[i];
			} else {
				// �ַ���ת������
				temp2 = transition(sub,count);
				// ��flag=2ʱ��������
				if (flag == 2) {
					flag = 1;
					// ��ȡ��ֵ�б�ǰһ����ֵ;
					temp1 = numbers[numbersindex - 1];
					// �ж�symbol�˷����ǳ���,�ɹ��ǳ˷���ʧ��Ϊ����
					if (decide(symbol)==1) {
						temp2 = calculator.multiplication(temp1, temp2);
					} else {
						System.out.println(temp1);
						System.out.println(temp2);
						temp2 = calculator.divsition(temp1, temp2);						
					}
					// ����ǰһ����ֵ
					numbersindex--;
				}
				// temp2������ֵ�б�
				numbers[numbersindex++] = temp2;
				// ��ȡ����
				symbol = Cexpression[i];
				// ת����ֵ�±�λ������
				count = 0;

				// �ж��Ƿ����flag��flag=2������������뵽�����б�
				if (judge(symbol) > flag) {
					flag = 2;
				} else {
					// ���뵽�����б�
					symbols[symbolsindex++] = symbol;
				}

			}
		}
		// ������ݽṹ
		System.out.println("������ݽṹ");
		for (double i : numbers) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (char i : symbols) {
			System.out.print(i);
		}
		System.out.println();

		double temp = numbers[0];
		count = 0;
		for (int i = 1; i < numbers.length; i++) {
			if (symbols[count] == '+') {
				temp += numbers[i];
				count++;
			} else if (symbols[count] == '-') {
				temp -= numbers[i];
				count++;
			}
		}

		// ������ս��
		System.out.println("���Ϊ" + temp);

		// ������ݽṹ
		System.out.println("������ݽṹ");
		for (double i : numbers) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (char i : symbols) {
			System.out.print(i);
		}

	}

	private static int judge(char symbol) {
		if (symbol == '+') {
			return 1;
		} else if (symbol == '-') {
			return 1;
		} else if (symbol == '*') {
			return 2;
		} else if (symbol == '/') {
			return 2;
		}

		return 0;
	}

	private static int decide(char symbol) {
		if (symbol == '*') {
			return 1;
		} else if (symbol == '/') {
			return 2;
		}
		return 2;
	}

	private static int transition(char[] sub1,int count) {
		int temp = 0;
		for (int i = 0; i < count; i++) {
			if (sub1[i] >= '0' && sub1[i] <= '9') {
				temp = temp * 10;
				temp += (sub1[i] - '0');
			}
		}
		return temp;
	}
}
