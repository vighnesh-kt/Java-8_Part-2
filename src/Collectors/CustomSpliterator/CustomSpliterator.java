package Collectors.CustomSpliterator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Spliterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;


public class CustomSpliterator {
	
	public static void main(String[] args) {
		
		
		//trySplit() example
//		String a="1 2 3 4 5 6";
//		Spliterator<String> spliterator = Arrays.stream(a.split(" ")).spliterator();
//		Spliterator<String> trySplit = spliterator.trySplit();
//		
//		spliterator.forEachRemaining(s->System.out.println(s));
//		trySplit.forEachRemaining(s->System.out.println(s));
		
		
		//custom spliterator
		Path p=Paths.get("/Users/BaBa/workspace-spring-tool-suite-4-4.26.0.RELEASE/Java_8_Part_2/src/Collectors/CustomSpliterator/Books.txt");
//		System.out.println(p.getFileName());
		try(Stream<String> lines = Files.lines(p)){
			//gives each line
//			lines.forEach(s->System.out.printl

			Spliterator<String> baseSpliterator = lines.spliterator();
			Spliterator<Book> bookSpliterator=new BookSpliterator(baseSpliterator);
			bookSpliterator.forEachRemaining(s->System.out.println(s.toString()));
			
			//another way
			StreamSupport.stream(bookSpliterator, false);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
