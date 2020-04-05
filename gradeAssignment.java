package anushkaAttempt;

import java.util.Scanner;

public class gradeAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner reader = new Scanner(System.in);  
	
//	System.out.println("Enter your grade:");
	
	//int grade = reader.nextInt(); // Reads input
	
	int grade = 0 ;
	
/*	if (grade == 100) {
		System.out.println("WOW! You got an A+!");
		
	} else if ((grade >= 90) && (grade <= 100)) {
		System.out.println("Keep up the good work! You got an A!");
		
	} else if ((grade >= 80) && (grade <= 90)) {
		System.out.println("Right on point! You got an B.");
		
	} else if ((grade >= 70) && (grade <= 80)) {
		System.out.println("That was a close call! You got a C.");
		
	} else if ((grade < 70))
	System.out.println("Try harder next time! You got an F.");
	
	}
	*/
	
   System.out.println("To exit enter any negative number");
	
	while(grade >= 0 )
	{	
		System.out.println("Enter your grade:");
		
		grade = reader.nextInt(); // Reads input
		
		   if (grade >= 0 )
		   {	   
				if (grade < 70) {
					System.out.println("Stupid, why are you coming to the school, you failed");
				} else if (grade < 80) {
					System.out.println("That was a close call! You got a C.");
				} else if (grade < 90) {
					System.out.println("Right on point! You got an B.");
				} else if (grade < 100 ) {
					System.out.println("Keep up the good work! You got an A!");
				} else if (grade == 100) {
					System.out.println("WOW! You got an A+!");
				}
		   } else {
			   System.out.println("Thank you for using my program, bye bye, Stay at home and safe");
		   }
	}
  }
	
}

