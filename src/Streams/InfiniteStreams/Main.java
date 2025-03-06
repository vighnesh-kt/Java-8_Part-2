package Streams.InfiniteStreams;

import java.util.stream.Stream;

public class Main {
	
	public static void main(String[] args) {
		
		//infinite streanss
	
		//iterate 
		
		//limit
		//Stream.iterate(10, i->i+1).limit(10).forEach(s->System.out.println(s));
		
		//java 9 overloaded
//		Stream.iterate(10, i->i<25,i->i+1).forEach(i->System.out.println(i));
		
		//generate
//		Stream.generate(()->"Run").forEach(s->System.out.println(s));
		
		//random number
		Stream.generate(()->Math.random()*100)
						.limit(5)
						.mapToInt(s->s.intValue())
						.forEach(s->System.out.println(s));
		
	}

}
