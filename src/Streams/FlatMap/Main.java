package Streams.FlatMap;

import java.util.stream.Stream;

public class Main {
	
	public static void main(String[] args) {
		
		
		Stream<Integer> of = Stream.of(1,2);
		Stream<Integer> of2 = Stream.of(3,4);
		
		Stream<Stream<Integer>> of3 = Stream.of(of,of2);
		
		Stream<Integer> flatMap = Stream.of(of,of2).flatMap(s->s);
		
		flatMap.forEach(s->System.out.println(s));
	}

}
