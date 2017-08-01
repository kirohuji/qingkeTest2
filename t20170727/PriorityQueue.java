package t20170727;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

/**
 * @author zyd
 * @version
 * @param <A>
 */
public class PriorityQueue<A> extends AbstractCollection<A> implements Queue<A> {
	private static final int DEFAULT_CAPACITY = 10;
	private int currentSize;
	private A[] array;
	private Comparator<? super A> cmp;

	public PriorityQueue() {
		currentSize = 0;
		cmp = null;
		array = (A[]) new Object[DEFAULT_CAPACITY + 1];
	}

	public PriorityQueue(Comparator<? super A> c) {
		currentSize = 0;
		cmp = c;
		array = (A[]) new Object[DEFAULT_CAPACITY + 1];
	}

	public PriorityQueue(Collection<? extends A> coll) {
		cmp = null;
		currentSize = coll.size();
		array = (A[]) new Object[(currentSize + 2) * 11 / 10];
		int i = 1;
		for (A item : coll) {
			array[i++] = item;
		}
		buildHeap();
	}

	private void buildHeap() {
		// TODO Auto-generated method stub
		for(int i=currentSize/2;i>0;i--)
			percolateDown(i);
	}

	private void doubleArray() {

	}

	private int compare(A lhs, A rhs) {
		return currentSize;

	}

	@Override
	public boolean offer(A e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public A remove() {
		// TODO Auto-generated method stub
		A minItem = element();
		array[1] = array[currentSize--];
		percolateDown(1);
		return minItem;
	}

	private void percolateDown(int hole) {
		// TODO Auto-generated method stub
		int child;
		A tmp=array[hole];
		for(;hole*2<=currentSize;hole=child){
			child=hole*2;
			if(child!=currentSize&&compare(array[child+1],array[child])<0)
				child++;
			if(compare(array[child],tmp)<0)
				array[hole]=array[child];
			else
				break;
		}
		array[hole]=tmp;
	}

	@Override
	public A poll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public A element() {
		// TODO Auto-generated method stub
		if (isEmpty())
			throw new NoSuchElementException();
		return array[1];
	}

	@Override
	public A peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<A> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return currentSize;
	}

	public void clear() {
		currentSize = 0;
	}

	public boolean add(A x) {
		if (currentSize + 1 == array.length)
			doubleArray();
		int hole = ++currentSize;
		array[0] = x;
		for (; compare(x, array[hole / 2]) < 0; hole /= 2)
			array[hole] = array[hole / 2];
		array[hole] = x;
		return true;
	}

}
