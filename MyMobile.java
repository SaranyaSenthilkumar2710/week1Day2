package week1.Day2;
/* Program to understand the object, method and how to call a method */
public class MyMobile {
	public void makeCall() {
		System.out.println("I am makeCall method!");
	}
	public void sendMessage() {
		System.out.println("I am sendMessage method!");
	}
	private void payBills() {
		System.out.println("I am payBills method!");
	}

	public static void main(String[] args) {
		// Creating object
		MyMobile m = new MyMobile();
		
		// Calling the methods with object
		System.out.println("\nCalling public makeCall() :");
		m.makeCall();
		System.out.println("\nCalling public sendMessage() :");
		m.sendMessage();
		System.out.println("\nCalling private payBills() :");
		m.payBills();
	}

}
