package DesignPatterns.Behavioural.Iterator;

public interface MyIterator<T> {
	
	boolean hasNext();
	
	boolean hasPrevious();
	
	T next();
	
	T previous();

}
