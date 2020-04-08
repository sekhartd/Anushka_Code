package anushkaAttemptTwo;

public class buzzFuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
		for(int i = 1; i < array.length; i++ )
			if (i%3==0 && i%5==0) {
					System.out.println(i+ "is a buzzfuzz number"); 
	}else if(i %3 == 0) {
		System.out.println(i + " is a buzz number");
	} else if(i%5 == 0) {
		System.out.println(i + " is a fuzz number");	
}
}
}