
package DesignPatterns.Creational.Factory;

public class Main {
	
	public static void main(String[] args) {
		
		//from email
		Sms email=SmsFactory.getNotification("Email");
		email.notifyUser();
		
		//from text
		Sms txt=SmsFactory.getNotification("Text");
		txt.notifyUser();
	}

}
