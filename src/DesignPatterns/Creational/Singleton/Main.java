package DesignPatterns.Creational.Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		
		//basic singleton
		
		BasicSingleton obj1=BasicSingleton.getObj();
		BasicSingleton obj2=BasicSingleton.getObj();
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		
		
		//eager initialization
		
//		EagerInitialization obj1=EagerInitialization.getObj();
//		EagerInitialization obj2=EagerInitialization.getObj();
//		
//		System.out.println(obj1.hashCode());
//		System.out.println(obj2.hashCode());
		
		//BillPuck 
		
//		BillPugh obj1=BillPugh.getObj();
//		BillPugh obj2=BillPugh.getObj();
//		
//		System.out.println(obj1.hashCode());
//		System.out.println(obj2.hashCode());
		
		//enum
//		Singleton obj1=Singleton.instance;
//		Singleton obj2=Singleton.instance;
//		
//		System.out.println(obj1.hashCode());
//		System.out.println(obj2.hashCode());
		
		//Breaking singleton
		Constructor<BasicSingleton> constructor=BasicSingleton.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		BasicSingleton obj3=constructor.newInstance();
		System.out.println(obj3.hashCode());

	}

}
