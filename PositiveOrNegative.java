package week1.Day2;
/*Program to check whether the given number is Positive or Negative*/
public class PositiveOrNegative {

	public static void main(String[] args) {
		int input = 35;
		System.out.println("Input given : "+input);
		//Condition(input > 0) is true then given Input is Positive 
		if (input > 0) {
			System.out.println("The number "+input+" is Positive!");
		} 
		//Condition(input < 0) is true then given Input is Negative
		else if (input < 0) {
			System.out.println("The number "+input+ " is Negative!");
		} 
		//else given input is neither Positive or Negative
		else {
			System.out.println("The number "+input+ " is neither Positive nor Negative!");
		}
	}

}

