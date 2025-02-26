package DesignPatterns.Creational.Builder;

import DesignPatterns.Creational.Builder.Mobile.MobileBuilder;

public class Main {

	public static void main(String[] args) {
		Mobile mob1=new Mobile.MobileBuilder()
				.setProcessor("Snap")
				.build();
		Mobile mob2=new Mobile.MobileBuilder()
				.setCamera(10)
				.build();
		System.out.println(mob1);
		System.out.println(mob2);
	}
}
