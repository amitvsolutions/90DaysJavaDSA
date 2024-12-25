package dp.behavioral.strategy;

public class EmailCommunication implements Communication{

	@Override
	public void sendCommunication() {
		System.out.println("Email sent successfully...!!!");		
	}

}
