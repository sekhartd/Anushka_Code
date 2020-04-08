package anushkaAttemptTwo;

import java.util.Arrays;

public class arrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int[] num= {7,9,10,4};
		
		Arrays.parallelSort(num);
		
		for (int i=0; i < num.length; i++){
			System.out.println("The sorted number array has: " + num[i] );
		
		}
		
		String[] word = {"Sekhar", "Vasavi","Anushka","Anvita"};
		
		Arrays.sort(word);
		
		for (int i=0; i < num.length; i++){
			System.out.println("The sorted string array has: " + word[i] );
		
		}
	}

}
