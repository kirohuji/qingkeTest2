package t20170707;

public class PrintInt {
	private static final String DIGIT_TABLE = "0123456789abcdef";
	private static final int MAX_BASE = DIGIT_TABLE.length();
	public static void main(String[] args){
		printInt(100,8);
	}
	private static void printIntRec(long n, int base) {
		if (n >= base) {
			printIntRec(n / base, base);
		}
		System.out.println(DIGIT_TABLE.charAt((int) (n % base)));
	}

	public static void printInt(long n, int base) {
		if (base <= 1 || base > MAX_BASE) {
			System.out.println("Cannot print in base" + base);
		}else{
			if(n<0){
				n=-n;
				System.out.println("-");
			}
			printIntRec(n,base);
		}

	}
}
