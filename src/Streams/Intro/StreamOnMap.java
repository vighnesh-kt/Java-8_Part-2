package Streams.Intro;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

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
		maps.keySet().stream().forEach(s->System.out.println(s));
		maps.values().stream().forEach(s->System.out.println(s));
		
		
	}

}
