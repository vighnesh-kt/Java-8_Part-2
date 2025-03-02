package Streams.Methods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Reduce {
	
	public static void main(String[] args) {
		
		Optional<Integer> i=Stream.of(2,2,2)
		.reduce((s,t)->s*t);
		i.ifPresent(s->System.out.println(s));
		
		System.out.println(i);
		
		//find largest string
		List<String> words = Arrays.asList("Java", "Streams", "Are", "Powerful");
		
		Optional<String> w=words.stream()
		.reduce((w1,w2)->w1.length()>w2.length()?w1:w2);
		
		w.ifPresent(System.out::print);
	}

}
