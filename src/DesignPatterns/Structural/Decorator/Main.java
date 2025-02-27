package DesignPatterns.Structural.Decorator;

public class Main {
	
	public static void main(String[] args) {
		Coffee cold=new ColdCoffee();
		System.out.println(cold.getCoffeeType());
		
		Coffee hot=new IceCream(new HotCoffee());
		System.out.println(hot.getCoffeeType());
		System.out.println(hot.getPrice());
		
		//Coffee hotWithMilkWithSugar=new Sugar(hot);//we can pass hot as it will have icecream with sugar
		Coffee hotWithIcecreamWithSugar=new Sugar(new IceCream(new HotCoffee()));//we can pass hot as it will have ice cream with sugar
		System.out.println(hotWithIcecreamWithSugar.getCoffeeType());
		System.out.println(hotWithIcecreamWithSugar.getPrice());
		
		Coffee coldIcecreamWithSugar=new Sugar(new IceCream(cold));
		//we cannot pass icecream with sugar because decorator implementing
		//it needs a base class in constructor
		System.out.println(coldIcecreamWithSugar.getCoffeeType());
		System.out.println(coldIcecreamWithSugar.getPrice());
	
		
		
	}

}
