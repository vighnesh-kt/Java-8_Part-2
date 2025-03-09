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
		
//		flatMap.forEach(s->System.out.println(s));
//		of3.flatMap(s->s).forEach(s->System.out.println(s));
		
		
		Stream<String> third = Stream.of("3rd level");
		Stream<Stream<String>> second = Stream.of(third);
		Stream<Stream<Stream<String>>> first = Stream.of(second);
		
//		third.forEach(s->System.out.println(s));
		
//		second.forEach(s->System.out.println(s));//returning stream
		
		
		
		Path p=Paths.get("/Users/BaBa/workspace-spring-tool-suite-4-4.26.0.RELEASE/Java_8_Part_2/src/Streams/FlatMap/temp.txt");

		try (Stream<String> lines = Files.lines(p);){
//			lines.forEach(s->System.out.println(s)); prints the stream of line
			
			lines.map(s->Arrays.stream(s.split(" "))).forEach(st->System.out.println(st));//print memory ref of array as split return array if not used arrays.stream to convert into stream
//			First Step (Files.lines(p))
//			Creates a Stream<String> with one element (the entire line).
//			Second Step (map(s -> Arrays.stream(s.split(" "))))
//			The single string "hello world world from Java" is split into an array:
//			["hello", "world", "world", "from", "Java"]
//			Arrays.stream(...) converts this array into a Stream<String> of words.
//			Third Step (forEach(st -> System.out.println(st)))
//			st is a Stream<String>, not individual words.
//			Printing st prints the memory reference of the Stream<String>, not its contents:
//			Instead, each line (even if there's only one) is converted into a Stream<String> of words.
//					map results in a Stream<Stream<String>>, which is why you're seeing memory references.
//			map transforms each element of a stream individually and keeps them as separate elements.

			
			
//			lines.flatMap(line->Arrays.stream(line.split(" "))).forEach(s->System.out.println(s));
			
//			flatMap flattens this Stream<Stream<String>> into a single Stream<String>, resulting in:

			
			
			//without stream Single String
			String s1="Hello world java world";
			String[] split = s1.split(" ");
//			Arrays.stream(split);  //single string in stream

			
			String t="Hello world java world";
			String[] split2 = t.split(" ");
			
			Stream.of(split,split2).map(map->Arrays.stream(map)) //if tw string then it is array of strin
			// using map to convert [] into stream
					.flatMap(s->s).forEach(st->System.out.println(st));
			
			
//			stream.flatMap(st->Arrays.stream(st)).forEach(stt->System.out.println(stt));
			
			
			

			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
