package week1.Day2;
/* Program to print all the odd numbers with the given range 1-20*/
public class PrintOddNumbersInRange {
	public static void main(String[] args) {
		// Input start_range-1 and end_range-20
		int start = 1;
		int end = 20;
		int value;
		System.out.println("Odd Numbers from 1 to 20 :");
		for (int i = start; i <= end; i++) {
			value = i % 2;
			if (value == 1) {
				System.out.println(i);
			}
		}

	}
}
