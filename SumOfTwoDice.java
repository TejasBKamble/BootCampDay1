package Mypackage;

import java.util.Random;

public class SumOfTwoDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Random random = new Random();

	        // generate two random integers between 1 and 6
	        int a = random.nextInt(6) + 1;
	        int b = random.nextInt(6) + 1;
	        
	        System.out.println("A :: "+a);
	        System.out.println("B :: "+b);
	        
	        System.out.println(a+b);
	}

}
