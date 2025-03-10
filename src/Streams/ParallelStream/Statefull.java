package Streams.ParallelStream;

import java.util.List;
import java.util.stream.Collectors;

public class Statefull {
	
	public static void main(String[] args) {
		
		
		List<Integer> list = List.of(1,2,4,5,6,7,9);

		List<Integer> collect = list
		.parallelStream()
		.skip(2)
		.limit(5)
		.collect(Collectors.toList());
		
	}

}
