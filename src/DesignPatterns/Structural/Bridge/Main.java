package DesignPatterns.Structural.Bridge;

public class Main {
	
	public static void main(String[] args) {
		
		Vehicle car=new Car(new RepairWorkShop());
		car.manufacture();
		
		Vehicle bike=new Bike(new PaintWorkShop());
		bike.manufacture();
	}

}
