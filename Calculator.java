package week1.Day2;
/* This Class has 4 public methods which is going to call by another class*/
public class Calculator {

	public void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}

	public void sub(int a,int b) {
		System.out.println(a-b);
	}

	public void mul(double a,double b) {
		System.out.println(a*b);
	}

	public void div(float a,float b) {
		System.out.println(a/b);
	}

}
