package week1.Day2;
/*Program to convert Negative number to Positive number*/
public class ConvertNegativeToPositiveNumber {
	public static void main(String[] args) {
		int input = -40;
		System.out.println("Input given : "+input);
		// if input is lesser than 0 then the number is negative, need to convert it
		
		if (input < 0) {
			input = -input;
			System.out.println("Converted Positive number is " + input);
		}
		else {
			System.out.println("Given number " +input+ " is Positive number !");
		}

	}

}
