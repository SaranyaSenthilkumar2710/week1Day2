package week1.Day2;
/* This Program is going to call a method in another class "Chrome" which is in same Package */

public class Browser{
	public static void main(String[] args) {
		//Creating Object for the Parent class "Chrome" which is in same Package
		Chrome obj = new Chrome();

		//Calling the Parent Class "Chrome" method from here using object
		obj.getName();
	}
}

