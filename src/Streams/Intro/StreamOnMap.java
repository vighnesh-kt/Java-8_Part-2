package Streams.Intro;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamOnMap {
	
	public static void main(String[] args) {
		
		Map<Integer,String>maps=new HashMap<>();
		maps.put(1, "Raj");
		maps.put(2, "Jay");
		
//		for(Entry<Integer,String> e:maps.entrySet()) {
//			System.out.println(e.getKey()+" "+e.getValue());
//		}
//		for(Integer i:maps.keySet()) {
//			System.out.println(i);
//		}
//		for(String i:maps.values()){
//			System.out.println(i);
//		}
		
		maps.entrySet()//takes entry key and value
		.forEach(s->System.out.println( s.getKey()+" "+s.getValue()));
		//only key
		maps.keySet().stream().forEach(s->System.out.println(s));
		//only value
		maps.values().stream().forEach(s->System.out.println(s));
		
		//string
		Stream<String> string = Stream.of("qw","qqe");
		
		// Array class stream 
		int [] arr= {1,2,3,4};
		IntStream stream = Arrays.stream(arr);
		
		
	}
	

}
