package DesignPatterns.Creational.Factory;

public class SmsFactory {
	
	static Sms getNotification(String type) {
		if(type.equals("Email")) {
			return new EmailSms();
		}
		if(type.equals("Text")) {
			return new TextSms();
		}
		return null;
	}

}
