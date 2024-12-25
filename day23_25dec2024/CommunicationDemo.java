package dp.behavioral.strategy;

public class CommunicationDemo {

	public static void main(String[] args) {
		CommunicationContext communicationContext = new CommunicationContext(new EmailCommunication());
		
		communicationContext.sendCommunication();

	}

}
