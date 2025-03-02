package DesignPatterns.Behavioural.Iterator;

import java.util.List;

public class MyIteratorImpl<T> implements MyIterator<T> {
	
	List<T> obj;
	int position=0;
	int length;
	
	
	public MyIteratorImpl(List<T> t){
		this.obj=t;
		length=t.size();
	}
	


	@Override
	public boolean hasNext() {
		if(position>=length) return false;
		return true;
	}

	@Override
	public boolean hasPrevious() {
		// TODO Auto-generated method stub
		if(position>=length) return true;
		return false;
	}

	@Override
	public T next() {
		// TODO Auto-generated method stub
		T value=obj.get(position);
		position++;
		return value;
	}
	
	

	@Override
	public T previous() {
		// TODO Auto-generated method stub
		T value=obj.get(position);
		position--;
		return value;
	}

}
