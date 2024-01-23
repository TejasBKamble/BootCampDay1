package Mypackage;

import java.util.Scanner;

public class PoundToKG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double kg,pound;
       Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Weight in Pound");
		pound=sc.nextDouble();
		
		kg=pound *  0.453592;
		
		System.out.println("Enter Weight in KG is :: "+ kg);
		
		sc.close();
		
	}

}
