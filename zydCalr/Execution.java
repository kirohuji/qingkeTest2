package zydCalr;

import java.util.Scanner;

public class Execution {
	public double execute(String str){
		String expression = str + "+1";
		// 初始化开始
		//
		char[] Cexpression = expression.toCharArray();
		// 创建运算器
		Calculator calculator = new Calculator();
		// 数值列表
		double[] numbers = new double[30];
		int numbersindex = 0;
		// 转型列表
		char[] sub = new char[30];
		// 数值下标位置
		int count = 0;
		// 符号列表
		char[] symbols = new char[10];
		int symbolsindex = 0;
		// temp1是数值列表上一个数值，temp2是当前的数值
		double temp1 = 0, temp2 = 0;
		;
		// 符号
		char symbol = 0;
		int flag = 1;
		// 初始化结束
		// 第一次遍历
		for (int i = 0; i < expression.length(); i++) {
			if (Cexpression[i] >= '0' && sub[i] <= '9') {
				sub[count++] = Cexpression[i];
			} else {
				// 字符串转型double
				temp2 = transition(sub,count);
				// 当flag=2时进行运算
				if (flag == 2) {
					flag = 1;
					// 获取数值列表前一个数值;
					temp1 = numbers[numbersindex - 1];
					// 判断symbol乘法还是除法,成功是乘法，失败为除法
					if (decide(symbol)==1) {
						temp2 = calculator.multiplication(temp1, temp2);
					} else {
						temp2 = calculator.divsition(temp1, temp2);						
					}
					// 覆盖前一个数值
					numbersindex--;
				}
				// temp2存入数值列表
				numbers[numbersindex++] = temp2;
				// 获取符号
				symbol = Cexpression[i];
				// 转型数值下标位置清零
				count = 0;

				// 判断是否大于flag，flag=2，不大于则加入到符号列表
				if (judge(symbol) > flag) {
					flag = 2;
				} else {
					// 加入到符号列表
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
		System.out.println("请输入算术表达式");
		Scanner in = new Scanner(System.in);
		String expression = in.nextLine();
		expression = expression + "+1";
		System.out.println("内部字符串改变为" + expression);
		// 初始化开始
		//
		char[] Cexpression = expression.toCharArray();
		// 创建运算器
		Calculator calculator = new Calculator();
		// 数值列表
		double[] numbers = new double[30];
		int numbersindex = 0;
		// 转型列表
		char[] sub = new char[30];
		// 数值下标位置
		int count = 0;
		// 符号列表
		char[] symbols = new char[10];
		int symbolsindex = 0;
		// temp1是数值列表上一个数值，temp2是当前的数值
		double temp1 = 0, temp2 = 0;
		;
		// 符号
		char symbol = 0;
		int flag = 1;
		// 初始化结束
		// 第一次遍历
		for (int i = 0; i < expression.length(); i++) {
			if (Cexpression[i] >= '0' && sub[i] <= '9') {
				sub[count++] = Cexpression[i];
			} else {
				// 字符串转型整型
				temp2 = transition(sub,count);
				// 当flag=2时进行运算
				if (flag == 2) {
					flag = 1;
					// 获取数值列表前一个数值;
					temp1 = numbers[numbersindex - 1];
					// 判断symbol乘法还是除法,成功是乘法，失败为除法
					if (decide(symbol)==1) {
						temp2 = calculator.multiplication(temp1, temp2);
					} else {
						System.out.println(temp1);
						System.out.println(temp2);
						temp2 = calculator.divsition(temp1, temp2);						
					}
					// 覆盖前一个数值
					numbersindex--;
				}
				// temp2存入数值列表
				numbers[numbersindex++] = temp2;
				// 获取符号
				symbol = Cexpression[i];
				// 转型数值下标位置清零
				count = 0;

				// 判断是否大于flag，flag=2，不大于则加入到符号列表
				if (judge(symbol) > flag) {
					flag = 2;
				} else {
					// 加入到符号列表
					symbols[symbolsindex++] = symbol;
				}

			}
		}
		// 输出数据结构
		System.out.println("输出数据结构");
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

		// 输出最终结果
		System.out.println("结果为" + temp);

		// 输出数据结构
		System.out.println("输出数据结构");
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
