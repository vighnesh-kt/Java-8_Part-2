package DesignPatterns.Structural.Decorator;

public abstract class CoffeeDecorator implements Coffee{
	
	private Coffee coffee;
	
	public CoffeeDecorator(Coffee coffee) {
		this.coffee=coffee;
	}
	
	public int getPrice() {
		// TODO Auto-generated method stub
		return coffee.getPrice();
	}

	public String getCoffeeType() {
		// TODO Auto-generated method stub
		return coffee.getCoffeeType();
	}
	


}

//public interface CoffeeDecorator extends Coffee{
//		
//	public int getPrice();
//
//	public String getCoffeeType();
//	
//}
