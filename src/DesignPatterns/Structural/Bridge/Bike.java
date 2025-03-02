package DesignPatterns.Structural.Bridge;

public class Bike extends Vehicle{

	public Bike(WorkShop workshop) {
		super(workshop);
		// TODO Auto-generated constructor stub
	}
	
	public void manufacture() {
		System.out.println("For Bike");
		workshop.work();
	}

}
