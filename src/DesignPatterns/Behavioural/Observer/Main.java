package DesignPatterns.Behavioural.Observer;

public class Main {

	public static void main(String[] args) {
		
		Product p=new Product("Iphone 17 pro");
		Product p2=new Product("Iphone 18");
		User u1=new User("Raj");
		User u2 =new User("Jay");
		p.addObserver(u2);
		p.addObserver(u1);
		
		p.setInStock(false);
	
	}
}
