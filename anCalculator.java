package anushkaAttempt;

import java.util.Scanner;

public class anCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner reader = new Scanner(System.in);
		
		
		int a;
		int b;
		String request = null;
		boolean conf = true;
		
		while (conf == true) {
			
		System.out.println("Enter your first number:");
		a = reader.nextInt();
		
		System.out.println("Enter your second number:");
		b = reader.nextInt();

		
		int sum;
		sum = a + b;
		
		int difference;
		difference = a-b;
		
		int product;
		product = a * b;
		
		int quotient;
		quotient = a/b;
		

		System.out.println("What operation would you like : add, subtract, multiply, or divide?");
		 request = reader.nextLine();
		 
		if (request == "add") {
			System.out.println("the sum of your number is: " + sum);
		} else if ( request == "subtract") {
			System.out.println("the difference of your number is: " + difference);
		}else if ( request == "multiply") {
			System.out.println("the product of your number is: " + product);
		}else if( request == "divide") {
		System.out.println("the quotient of your number is: " + quotient);
		
	}
}
		

		
	}

}
