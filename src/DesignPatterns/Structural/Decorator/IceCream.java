package DesignPatterns.Structural.Decorator;

public class IceCream extends CoffeeDecorator{

	public IceCream(Coffee coffee) {
		super(coffee);
	}	
	
	public int getPrice() {
		return super.getPrice()+10;
	}
	
	public String getCoffeeType() {
		return super.getCoffeeType()+"With Ice-Cream";
	}
}

//public class IceCream implements CoffeeDecorator{
//	
//	Coffee coffee;
//
//	public IceCream(Coffee coffee) {
//		this.coffee=coffee;
//	}	
//	
//	public int getPrice() {
//		return coffee.getPrice()+10;
//	}
//
//	@Override
//	public String getCoffeeType() {
//		// TODO Auto-generated method stub
//		return coffee.getCoffeeType()+"With Ice-Cream";
//	}
//}
