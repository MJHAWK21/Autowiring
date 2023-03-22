package USTBATCHNO3.Com.Autowiring;

public class Smsservice implements MessageServices {

	public void sendmessage(String message) {
		System.out.println("Get sms messages from "+message);
		
	}

}
