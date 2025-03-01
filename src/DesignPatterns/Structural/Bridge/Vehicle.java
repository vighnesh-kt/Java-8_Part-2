package DesignPatterns.Structural.Bridge;

public  abstract class Vehicle {
	
	protected WorkShop workshop;
	
	public Vehicle(WorkShop workshop){
		this.workshop=workshop;
	}

	public abstract void manufacture();

}
