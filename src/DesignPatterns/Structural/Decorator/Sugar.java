package DesignPatterns.Structural.Decorator;

public class Sugar extends CoffeeDecorator{

	public Sugar(Coffee coffee) {
		super(coffee);
	}
	
	public int getPrice() {
		return super.getPrice()+10;
	}
	
	public String getCoffeeType() {
		return super.getCoffeeType()+"With Sugar";
	}
}

//public class Sugar implements CoffeeDecorator{
//	
//	public Sugar(Coffee coffee) {
//		this.coffee = coffee;
//	}
//
//	Coffee coffee;
//	
//	public int getPrice() {
//		return coffee.getPrice()+10;
//	}
//
//	@Override
//	public String getCoffeeType() {
//		// TODO Auto-generated method stub
//		return coffee.getCoffeeType()+"With Sugar";
//	}
//}