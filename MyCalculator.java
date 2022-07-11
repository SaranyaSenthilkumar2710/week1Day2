package week1.Day2;
/* This class MyCalculator calls the parent class Calculator and its method*/
public class MyCalculator {
	public static void main(String[] args) {
		
		//Creating object for parent class Calculator
		Calculator cal = new Calculator();

		System.out.println("Calling Addition Method with input of 5, 3 and 5 :");
		cal.add(5, 3, 5);

		System.out.println("Calling Subtraction Method with input of 5 and 3 :");
		cal.sub(5, 3);

		System.out.println("Calling Multiplication Method with input of 2.0 and 5.0 :");
		cal.mul(2.0d, 5.0d);

		System.out.println("Calling Division Method with input of 10.0 and 5.0 :");
		cal.div(10.0f, 5.0f);

	}
}
