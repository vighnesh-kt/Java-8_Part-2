package Streams.Methods;

import java.util.stream.Stream;

public class Map {
	
	public static void main(String[] args) {
		
		Stream.of(1,2,3,4,5,6,7,8,9,10)
		.map(ele->ele*25)
		.forEach(s->System.out.println( s*2));
		
		
		
	}

}
