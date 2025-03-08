package Streams.FlatMap;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
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
		
//		second.forEach(s->System.out.println(s));//returning stream
		
		
		
		Path p=Paths.get("/Users/BaBa/workspace-spring-tool-suite-4-4.26.0.RELEASE/Java_8_Part_2/src/Streams/FlatMap/temp.txt");

		try (Stream<String> lines = Files.lines(p);){
//			lines.forEach(s->System.out.println(s));
			
//			lines.flatMap(line->Arrays.stream(line.split(" "))).forEach(s->System.out.println(s));
			
			//without stream
			String s="Hello world java world";
			String[] split = s.split(" ");
			Arrays.stream(split).forEach(st->System.out.println(st));
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
