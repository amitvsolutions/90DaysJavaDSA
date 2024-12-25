package dp.behavioral.strategy;

public class CommunicationContext {
	private Communication communicationStrategy;
	
	public CommunicationContext(Communication communicationType) {
		this.communicationStrategy=communicationType;
	}
	
	public void sendCommunication() {
		communicationStrategy.sendCommunication();
	}

}
