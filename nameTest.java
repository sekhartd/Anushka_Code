package anushkaAttemptTwo;

import java.util.Scanner;

public class nameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner (System.in);
		String a;
		String b;
		String conf = "yes";
		
		while(conf.equals("yes")) {
		
		System.out.println("Enter your first name:");
		a = reader.nextLine();
		
		System.out.println("Enter your second name:");
		b = reader.nextLine();
		
		if( a.equals(b)) {
			System.out.println("Both names are the same!");
		}else {
			System.out.println("Sorry, the names are not the same.");
		}
		 System.out.println("Would you like to continue? Yes or No");
		 conf = reader.nextLine();
		
		}
	}

}
