package anushkaAttempt;

import java.util.Scanner;

public class whileLoopAttempt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       boolean conf = true;
		Scanner reader = new Scanner (System.in);
		
			while ( conf == true)	{
				
			
		System.out.println("What table would you like?");
		int table = reader.nextInt();
		
		System.out.println("How far would you like your table?");
		int length = reader.nextInt();
	
	
		for (int f = 0; f <= length; f++  ) {
			
			int total = table * f;
			
			 System.out.println(table + " * " + f + " = " + total);
		}	
			
		System.out.println("Do you want to continue ? True: Yes, False : No")	;
			
			 conf = reader.nextBoolean();
			
	}
	
	
	
	
	
}

}