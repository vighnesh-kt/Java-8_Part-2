package DesignPatterns.Structural.Adapter;

public class WeightInKilosImpl implements WeightInKilos{
	
	private WeightMachine pounds;
	
	public WeightInKilosImpl(WeightMachine pounds) {
		this.pounds=pounds;
	}

	@Override
	public double weightInKilos() {
		// TODO Auto-generated method stub
		System.out.println("Converting Pounds to KG");
		return pounds.calculateWeight()*0.45359237;
	}

}
