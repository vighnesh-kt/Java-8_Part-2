package DesignPatterns.Structural.Bridge;

public class Car extends Vehicle{

	public Car(WorkShop workshop) {
		super(workshop);
	}

	@Override
	public void manufacture() {
		// TODO Auto-generated method stub
		System.out.println("For car");
		workshop.work();//this will call the work method for passed workshop
	}

}
