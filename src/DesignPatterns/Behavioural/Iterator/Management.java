package DesignPatterns.Behavioural.Iterator;

import java.util.ArrayList;
import java.util.List;

public class Management<T> {
	
	ArrayList<T> list=new ArrayList<>();
	
	public T get(int index) {
		return list.get(index);
	}
	
	public boolean add(T obj) {
		return list.add(obj);
	}
	
	
	public MyIterator<T> iterator() {
		return new MyIteratorImpl<T>(list);
	}
	
	

}
