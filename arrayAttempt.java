package anushkaAttemptTwo;

import java.util.Arrays;
import java.util.Scanner;

public class arrayAttempt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		int d;
		
		System.out.println("You must enter 4 scores to use this program" );
		System.out.println(" ");
		
		System.out.println("Enter your first score:");
		a = reader.nextInt();
		System.out.println("Enter your second score:");
		b = reader.nextInt();
		System.out.println("Enter your third score:");
		c = reader.nextInt();
		System.out.println("Enter your fourth score:");
		d = reader.nextInt();
		
	
		int[] score = {a,b,c,d};
		
		Arrays.parallelSort(score);
		
		for(int i=0;i < score.length; i++)
		{
			System.out.println(score[i]);
		}
	}
}
