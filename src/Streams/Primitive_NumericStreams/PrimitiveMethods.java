package Streams.Primitive_NumericStreams;

import java.util.DoubleSummaryStatistics;
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
		
		List<Integer> imm=List.of(1,2,3);
		imm.add(4);
		imm.forEach(s->System.out.println());
		
		//avg
		OptionalDouble dou =books.stream()
		.map(s->s.getRating()).mapToDouble(r->r.doubleValue()).average();
		
		System.out.println(dou.getAsDouble());
		
		//max
		double d=books.stream().mapToDouble(r->r.getRating()).max().getAsDouble();
		System.out.println(d);
		
		DoubleSummaryStatistics summary=books.stream().mapToDouble(r->r.getRating()).summaryStatistics();
		System.out.println(summary);
		
		//of method to create primitive stream
		IntStream intStream =IntStream.of(1,2,3,4,5);
		LongStream longStream =LongStream.of(1L, 2L, 3L);
		DoubleStream doubleStream =DoubleStream.of(1.1, 2.2);

		
		//Convert primitive to Non Primitive
		intStream.boxed();
		longStream.boxed();
		doubleStream.boxed();
		
		intStream.mapToObj(s->s);
		longStream.mapToObj(s->s);
		doubleStream.mapToObj(s->s);
	}

}
