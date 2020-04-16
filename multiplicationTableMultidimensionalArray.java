package anushkaAttemptTwo;

import java.util.Scanner;

public class multiplicationTableMultidimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		int l;
		int t;
		
			System.out.println("Please enter the table you would like");
			a = reader.nextInt();
			b = a + 1;
			c = b + 1;
			
			System.out.println("Enter the desired length of your table");
			l = reader.nextInt();
			t = l+1;
			
			int[] a1 = new int[l];
			int[] b1 = new int[l];
			int[] c1 = new int[l];
			
			for ( int i = 0; i < l+1; i++) {
				int [][] table  = {
						{a,b,c,},
						{i}
				};
				a1[i]= a*i;
				System.out.println(a + "*" + i + "=" + a1[i]);
				b1[i]=b*i;
				System.out.println(b + "*" + i + "=" + b1[i]);	
				c1[i]=c*i;
				System.out.println(c + "*" + i + "=" + c1[i]);	
				
			 
			
			 	
					
				}
			 {
				
			}
	}

}

