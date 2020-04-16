package anushkaAttemptTwo;

import java.util.Random;
import java.util.Scanner;

public class bingoProgramAttempt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner (System.in);
		int upperbound = 10;
		Random rand = new Random();
		int number = rand.nextInt(upperbound); 
		int guess = 0; 
		int tries = 0;
		boolean cont = true;
		boolean win = false;
		int[] past = new int [100];
		String conf;
		
while (cont == true) {
	System.out.println("Would you like to play?");	
		 conf = reader.nextLine();
		
		
if (conf.equalsIgnoreCase("yes")) {
	
	while( win == false ){

		System.out.println("I have picked a number from 1-100. Try to guess what it is!");
		guess = reader.nextInt();
		past[tries] = guess;
		tries++;
		
	if(guess == number) {
		win = true;
		System.out.println("Congrats, you guessed it!");	
		System.out.println("The number was: " + number);
		System.out.println("It took you " + tries + " tries.");
		
		System.out.println("The previous guesses were:");
		for (int i = 0; i < tries; i++) {
			System.out.println(past[i]+ ",");
		}
		
		
	} else if ( guess < number) {
		System.out.println( "Your guess is too low. Guess again!");
	}else if (guess > number) { 
		System.out.println("Your guess is too high. Guess again!");
	}
		
	}

	}else if (conf.equalsIgnoreCase("No")) {
		cont = false;
		System.out.println("See you again next time!");
	}
}
	}
}

