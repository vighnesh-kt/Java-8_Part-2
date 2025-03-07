package Streams.FlatMap;

import java.util.stream.Stream;

public class Main {
	
	public static void main(String[] args) {
		
		Stream.of("hello");
		
		Stream<String> of = Stream.of("hello","there");
		Stream<String> of2 = Stream.of("learning","java");
		
		Stream<Stream< String >> of3 = Stream.of(of,of2);
		
		Stream< String > flatMap = of3.flatMap(s->s);
		
		flatMap.forEach(s->System.out.println(s));
//		of3.flatMap(s->s).forEach(s->System.out.println(s));
		
		
		Stream<String> third = Stream.of("3rd level");
		Stream<Stream<String>> second = Stream.of(third);
		Stream<Stream<Stream<String>>> first = Stream.of(second);
		
		third.forEach(s->System.out.println(s));
		
		second.forEach(s->System.out.println(s));
		
	}

}
