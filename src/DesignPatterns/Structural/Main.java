package DesignPatterns.Structural;

public class Main {
	
	public static void main(String[] args) {
		Coffee cold=new ColdCoffee();
		System.out.println(cold.getCoffeeType());
		
		Coffee hot=new HotCoffee();
		System.out.println(hot.getCoffeeType());
	}

}
