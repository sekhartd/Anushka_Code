package anushkaAttempt;

import java.util.Scanner;

public class dayOfWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner reader = new Scanner (System.in);
		
		int n; 
		System.out.println("Enter a number to assign a day of the week!");
		n = reader.nextInt();
		

	
		
	while  (n > 7) {
		System.out.println("Please enter a number from 1 - 7. ");
		System.out.println("Enter a number to assign a day of the week!");
		n = reader.nextInt();
	}
		switch(n) {
		
		
		case 1:{
			System.out.println("The day is: Sunday.");
			break;
		
		} case 2:{
			System.out.println("The day is: Monday. ");
		    break;
		
		} case 3: {
			System.out.println("The day is: Tuesday.");
			break;
		} case 4: {
			System.out.println("The day is: Wednesday.");
			break;
			
		} case 5: {
			System.out.println("The day is: Thursday.");
			break;
			
		} case 6: {
			System.out.println("The day is: Friday.");
			break;
			
		} case 7:{
			System.out.println("The day is: Saturday.");
		
			
		}
		
	}

}

		
	}
	
