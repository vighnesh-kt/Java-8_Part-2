package DesignPatterns.Creational.Factory;

public class EmailSms implements Sms{

	@Override
	public void notifyUser() {
		// TODO Auto-generated method stub
		System.out.println("From Email");
	}

}
