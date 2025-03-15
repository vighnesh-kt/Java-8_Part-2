package Collectors.CustomSpliterator;

import java.util.Spliterator;
import java.util.function.Consumer;

public class BookSpliterator implements Spliterator<Book> {

	private String name;
	private String author;
	private String genre;
	private double rating;
	private Spliterator<String> baseSpliterator;

	public BookSpliterator(Spliterator<String> baseSpliterator) {
		// TODO Auto-generated constructor stub
		this.baseSpliterator = baseSpliterator;
	}

	@Override
	public boolean tryAdvance(Consumer<? super Book> action) {
		// TODO Auto-generated method stub
		if (baseSpliterator.tryAdvance(name -> this.name = name)
				&& baseSpliterator.tryAdvance(author -> this.author = author)
				&& baseSpliterator.tryAdvance(genre -> this.genre = genre)
				&& baseSpliterator.tryAdvance(rating -> this.rating = Double.parseDouble(rating))) {

			action.accept(new Book(this.name, this.author, this.genre, this.rating));
			return true;
		}

		return false;
	}

	@Override
	public Spliterator<Book> trySplit() {
		// TODO Auto-generated method stub
		Spliterator<String> newSpliterator=baseSpliterator.trySplit();
		
		return (newSpliterator == null) ? null : new BookSpliterator(newSpliterator);
	}

	@Override
	public long estimateSize() {
		// TODO Auto-generated method stub
		return baseSpliterator.estimateSize()/4;
	}

	@Override
	public int characteristics() {
		// TODO Auto-generated method stub
		return baseSpliterator.characteristics();
	}

}
