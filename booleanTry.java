package anushkaAttempt;

import java.util.Scanner;

public class booleanTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in); 
		int l;
		int w;
		int a;
		int p;
		boolean request = true;
	
			while (request) {
		 
					System.out.println("Enter a length");
					l = reader.nextInt();
						
						System.out.println("Enter a width");
						w = reader.nextInt();
					
						a = l * w; 
						p = (l + w) * 2; 
						
			if (l == w) {
					 	 
				System.out.println("This is a square.");
				System.out.println("The area of the square is: " + a );
				System.out.println("The perimeter of the square is: " + p);
		
			} else{
				
			
				System.out.println("This is a rectangle.");
				System.out.println("The area of the rectangle is:" + a);
				System.out.println("The perimeter of the rectangle is:" + p);
			}
			 System.out.println("Do you want to continue? Please enter true or false.");
			request = reader.nextBoolean();
			
			
		}
				
	
	} 
	

}
