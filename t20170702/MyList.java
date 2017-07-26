package t20170702;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyList<T> implements List<T> {
	private int size;
	private T[] list;
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size==0;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return this.indexOf(o)>=0;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return Arrays.copyOf(list, size);
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(T e) {
		list[size++]=e;
		return true;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends T> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends T> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		for(int i=0;i<size;i++){
			list[i]=null;
		}
		size--;
		
	}

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return list[index];
	}

	@Override
	public T set(int index, T element) {
		// TODO Auto-generated method stub
		return list[index]=element;
	}

	@Override
	public void add(int index, T element) {
		// TODO Auto-generated method stub
		System.arraycopy(list, index, list, index+1, size-index);
		list[index]=element;
		size++;
	}

	@Override
	public T remove(int index) {
		// TODO Auto-generated method stub
		int numMoved = size - index - 1;
        if (numMoved > 0)
        	System.arraycopy(list, index+1, list, index, numMoved);
        list[--size]=null;
		return null;
	}

	@Override
	public int indexOf(Object o) {
	       if (o == null) {
	            for (int i = 0; i < size; i++)
	                if (list[i]==null)
	                    return i;
	        } else {
	            for (int i = 0; i < size; i++)
	                if (o.equals(list[i]))
	                    return i;
	        }
	        return -1;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<T> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<T> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

}
