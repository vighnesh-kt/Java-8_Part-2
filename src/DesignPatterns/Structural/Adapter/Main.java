package DesignPatterns.Structural.Adapter;

public class Main {
	
	public static void main(String[] args) {
		
		WeightMachine machine=new WeightInPounds();
		System.out.println(machine.calculateWeight());
		
		WeightInKilos kilo=new WeightInKilosImpl(machine);
		System.out.println(kilo.weightInKilos());
		
	}

}
