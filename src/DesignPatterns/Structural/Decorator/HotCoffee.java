package DesignPatterns.Structural.Decorator;


public class HotCoffee implements Coffee{
	
	int price=100;

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	@Override
	public String getCoffeeType() {
		// TODO Auto-generated method stub
		return "HotCoffee";
	}
	
	

}
