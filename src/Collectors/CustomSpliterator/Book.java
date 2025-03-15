package Collectors.CustomSpliterator;

public class Book {
	
	private String name;
	private String author;
	private String genre;
	private double rating;
	
	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", genre=" + genre + ", rating=" + rating + "]";
	}
	public Book(String name, String author, String genre, double rating) {
		this.name=name;
		this.author=author;
		this.genre=genre;
		this.rating=rating;
		// TODO Auto-generated constructor stub
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}
	public String getGenre() {
		return genre;
	}
	public double getRating() {
		return rating;
	}

}
