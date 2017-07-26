package t20170701;

/**
 * The SimpleArrayList implements a growalbe array of Object.
 * Insertions are always done at the end.
 */
public class SimpleArrayList {
	public static int a=10;
	private int theSize=0;
	private static final int INIT_CAPACITY=10;
	private Object[] theItems=new Object[INIT_CAPACITY];
	public int size(){
		return theSize;
	}
	public Object get(int idx){
		if(idx<0||idx>=size()){
			throw new ArrayIndexOutOfBoundsException();
		}
		return theItems[idx];
	}
	public boolean add(Object x){
		if(theItems.length==size()){
			Object[] old=theItems;
			theItems=new Object[theItems.length*2+1];
			for(int i=0;i<size();i++){
				theItems[i]=old[i];
			}
		}
		theItems[theSize++]=x;
		return true;
	}
	public static <E extends Comparable<E>> boolean contain(E[] arr,E x){
		for(E val:arr){
			if(x.equals(val))
				return true;
		}
		return false;
	}
	public static <E extends Comparable<? super E>> E findMax(E[] a){
		int maxIndex=0;
		for(int i = 1;i<a.length;i++){
			if(a[i].compareTo(a[maxIndex])>0){
				maxIndex=i;
			}
		}
		return a[maxIndex];
	}
}
