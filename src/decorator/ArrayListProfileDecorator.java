package decorator;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListProfileDecorator<L> extends ProfileDecorator<L>{
	
	public ArrayListProfileDecorator(List list){
	super(list);
	}

	@Override
	public int size() {
		
		      long start = System.nanoTime();
		        int result = this.list.size();
		         System.out.println("ArrayList size " + (System.nanoTime() - start));
		         return result;
	}


	@Override
	public boolean contains(Object o) {
		long start = System.nanoTime();
		         boolean result = this.list.contains(o);
		         System.out.println("ArrayList contains " + (System.nanoTime() - start));
		         return result;
	}
	@Override
	public boolean add(L e) {
		long start = System.nanoTime();
		        boolean result = this.list.add(e);
		         System.out.println("ArrayList add " + (System.nanoTime() - start));
		         return result;
	}

	@Override
	public boolean remove(Object o) {
		long start = System.nanoTime();
		         boolean result = this.list.remove(o);
		        System.out.println("ArrayList remove " + (System.nanoTime() - start));
		         return result;
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	


	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public L get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object set(int index, Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int index, Object element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public L remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

}
