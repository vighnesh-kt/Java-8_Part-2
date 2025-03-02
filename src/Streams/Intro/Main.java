package Streams.Intro;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
		
		List<Book>popHorBook=books.stream().filter(b->b.getGenre().equalsIgnoreCase("Horror")).filter(b->b.getRating()>1).collect(Collectors.toList());
		popHorBook.forEach(s->System.out.println( s.toString()));
	}

}
