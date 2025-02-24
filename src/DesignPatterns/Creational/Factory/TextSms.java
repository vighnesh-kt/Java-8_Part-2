package DesignPatterns.Creational.Factory;

public class TextSms implements Sms {

	@Override
	public void notifyUser() {
		// TODO Auto-generated method stub
		System.out.println("From Text");
	}

}
