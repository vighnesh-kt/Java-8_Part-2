package Streams.Intro;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		// Before Stream
		List<Book> books =Book.addBooks();

		List<Book> popularHorrorBooks = new ArrayList<>();

		for (Book book : books) {
			if (book.getGenre().equalsIgnoreCase("Horror") && book.getRating() > 3) {

				popularHorrorBooks.add(book);

			}
			
		}
		
		List<Book>popHorBook=books.stream()
				.filter(b->b.getGenre().equalsIgnoreCase("Horror"))
				.filter(b->b.getRating()>1)
				.collect(Collectors.toList());
		
		List<Book>comedy=books.stream()
				.filter(b->b.getGenre().equalsIgnoreCase("Comedy"))
				.collect(Collectors.toList());
		
		//popHorBook.forEach(s->System.out.println( s.toString()));
		comedy.forEach(s->System.out.println(s));
		

		//1.Source
		Stream<Book> stream = books.stream(); 
		
		
		//2. Intermediate Operation
		Stream<Book> horrorBooks = stream.filter((book) -> book.getGenre().equalsIgnoreCase("Horror"));
		
		
		//3. Intermediate Operation
		Stream<Book> pHorrorBooks = horrorBooks.filter((book) -> book.getRating() > 3);
		
		//4. Terminal operation
		List<Book> collect = pHorrorBooks.collect(Collectors.toList());
	}

}
