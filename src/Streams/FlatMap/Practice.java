package Streams.FlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice {
	
	public static void main(String[] args) {
		
	
	List<String> sentences = Arrays.asList("Java is awesome", "Streams are powerful");
		
		String string = sentences.stream().reduce((s,t)->s.concat(t)).get();
		System.out.println(string);
		
	}

}
