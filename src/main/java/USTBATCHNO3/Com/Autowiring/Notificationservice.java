package USTBATCHNO3.Com.Autowiring;

public class Notificationservice {
private MessageServices messageservices;
public void notifyservice(){
	messageservices.sendmessage("hey i am autowired");
	
}

public void setMessageservices(MessageServices messageservices) {
	this.messageservices = messageservices;
}
	


}
