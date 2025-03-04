package Streams.Primitive_NumericStreams;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import Streams.Intro.Book;

public class PrimitiveMethods {
	
	public static void main(String[] args) {
		
		List<Book> books =Book.addBooks();
		
		OptionalDouble dou =books.stream()
		.map(s->s.getRating()).mapToDouble(r->r.doubleValue()).average();
		
		System.out.println(dou.getAsDouble());
		
		//of method to create primitive stream
		IntStream intStream =IntStream.of(1,2,3,4,5);
		LongStream longStream =LongStream.of(1,2,3,4,5);
		DoubleStream doubleStream =DoubleStream.of(1,2,3,4,5);
		
		//Convert primitive to Non Primitive
		intStream.boxed();
		longStream.boxed();
		doubleStream.boxed();
	}

}
