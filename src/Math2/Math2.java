package Math2;

import java.util.Scanner;

public class Math2 {

	public static void main(String[] args) {
		int a; 
		int b; 
		int add; 
		int sub; 
		int mul; 
		int div; 
		
		Scanner input = new Scanner(System.in);
		Scanner myObj = new Scanner(System.in);

	    System.out.println("Welcome, Please enter your Name: ");
	    String name = myObj.nextLine(); //String User Input
	    
		System.out.println("");
	    
		System.out.println("Hello " + name + ", Choose your first number: ");
		a = input.nextInt();
		
		System.out.println("");

		System.out.println("Great, Choose your second number: ");
		b = input.nextInt();
		
		System.out.println("");
		
		add = a + b; 
		sub = a - b; 
		mul = a * b;
		div = a / b; 
		
		System.out.println("" + name + ", Your Calculations are listed Below: ");
		System.out.println("");
		System.out.println("- Result for Addition: " + add);
		System.out.println("- Result for Subtraction: " + sub);
		System.out.println("- Result for Multiplication: " + mul);
		System.out.println("- Result for Division: " + div);
	}

}
