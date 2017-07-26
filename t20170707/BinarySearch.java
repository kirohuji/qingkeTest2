package t20170707;

public class BinarySearch {
	public static <AnyType extends Comparable<? super AnyType>> int binarySearch(AnyType[] a, AnyType x) {
		return binarySearch(a, x, 0, a.length - 1);
	}

	private static <AnyType extends Comparable<? super AnyType>> int binarySearch(AnyType[] a, AnyType x, int low,
			int high) {
		if (low > high) {
			return -1;
		}
		int mid = (low + high) / 2;
		if (a[mid].compareTo(x)<0)
			return binarySearch(a, x, mid + 1, high);
		else if (a[mid].compareTo(x) > 0)
			return binarySearch(a, x, low, mid - 1);
		else
			return mid;
	}
}
