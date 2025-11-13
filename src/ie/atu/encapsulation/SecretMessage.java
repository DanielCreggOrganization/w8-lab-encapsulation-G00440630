package ie.atu.encapsulation;

public class SecretMessage {

	public String message;

	public SecretMessage(String message) {
		this.message = message;
	}

	public void displayMessage() {
		System.out.println("The secret message is: " + message);
	}

}
