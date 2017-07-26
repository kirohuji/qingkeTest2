package t20170708;

import java.util.Arrays;

public class CopyOfTest {
	public static void main(String[] args){
		int[] a={1,2,3};
		a=(int[])goodCopyOf(a,10);
		System.out.println(Arrays.toString(a));
		String[] b={"Tom","Disk","Harry"};
//		b=(String[])goodCopyOf(b,10);
//		System.out.println(Arrays.toString(b));
		
	}

	private static int[] goodCopyOf(Object a, int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
