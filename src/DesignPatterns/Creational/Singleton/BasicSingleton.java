package DesignPatterns.Creational.Singleton;

public class BasicSingleton {
	
	private static BasicSingleton obj;
	
	private BasicSingleton(){
		
		if(obj!=null) {
			throw new RuntimeException("Hacker hai bhai");
		}
		
	}

//	public  static BasicSingleton getObj() {
//		if (obj==null){
//			return obj=new BasicSingleton();
//		}
//		return obj;
//	}
	
	//synchronised method 
	
//	public  static synchronized BasicSingleton getObj() {
//		if (obj==null){
//			return obj=new BasicSingleton();
//		}
//		return obj;
//	}
	
	//synchronised block
	
	public static BasicSingleton getObj(){
		if(obj==null) {
			synchronized (BasicSingleton.class) {
				return obj=new BasicSingleton();
			}
		}
		return obj;
	}
}
