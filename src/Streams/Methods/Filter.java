package Streams.Methods;

import java.util.stream.Stream;

public class Filter {
	
	public static void main(String[] args) {
		Stream.of(1,2,3,4,5,6,7,8,9)
		.filter(s->s%2==0)
		.forEach(System.out::println);
	}

}
