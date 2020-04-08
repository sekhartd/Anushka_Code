package anushkaAttemptTwo;

import java.util.Scanner;

public class arrayPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner reader = new Scanner(System.in);
	
		int a;
		int b;
		int c;
		int d;
		
		System.out.println("You must enter 4 value to use this program" );
		System.out.println(" ");
		
		System.out.println("Enter your first value:");
		a = reader.nextInt();
		System.out.println("Enter your second value:");
		b = reader.nextInt();
		System.out.println("Enter your third value:");
		c = reader.nextInt();
		System.out.println("Enter your fourth value:");
		d = reader.nextInt();
		
		int[] array = {a, b, c, d};
		
		System.out.println("Your entered values are: " + a + ","+ b +","+ c+","+ d );
		
		System.out.println(a + b + c + d );
	}
}