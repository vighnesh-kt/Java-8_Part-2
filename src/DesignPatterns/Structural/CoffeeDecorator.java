package DesignPatterns.Structural;

public abstract class CoffeeDecorator implements Coffee{
	
	protected Coffee coffee;
	
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
