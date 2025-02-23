package DesignPatterns.Singleton;

public class EagerInitialization {
	
	private static EagerInitialization obj= new EagerInitialization();
	
	private EagerInitialization() {
		
	}
	
	public static EagerInitialization getObj() {
		return obj;
	}

}
