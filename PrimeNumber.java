package week1.Day2;
/*Program to check whether the given number is Prime number or not*/
public class PrimeNumber {

		  public static void main(String[] args) {
			// assigning input as 13
		    int input = 13;
		    boolean flag = false;
		    for (int i = 2; i <= input / 2; ++i) {
		      // condition for non prime number, loop breaks
		      if (input % i == 0) {
		        flag = true;
		        break;
		      }
		    }

		    if (!flag)
		      System.out.println(input + " is a Prime Number!");
		    else
		      System.out.println(input + " is not a Prime Number!");
		  }
		}


