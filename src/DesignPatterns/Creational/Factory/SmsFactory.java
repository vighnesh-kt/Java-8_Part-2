package DesignPatterns.Creational.Factory;

import java.util.function.Supplier;

public class SmsFactory {
	
	public static Sms getNotification(String type) {
		Supplier<Sms> sms = null;
		if(type.equals("Email")) {
			sms=(()->new EmailSms());
		}
		if(type.equals("Text")) {
			sms=()->new TextSms();
		}
		return sms.get();
	}

}
