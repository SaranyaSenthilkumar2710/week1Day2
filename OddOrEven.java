package week1.Day2;
/*Program to check whether the given number is Odd or Even*/
public class OddOrEven {
	public static void main(String[] args) {
		int input = 9;
		int num;
		// This mod(%) operator to check input is Odd or Even
		num = input%2;
		System.out.println("\nInput given is "+input);
		if(num==0) {
			System.out.println("\nGiven number is Even!");
		}else {
			System.out.println("\nGiven number is Odd!");
		}
	}
}
