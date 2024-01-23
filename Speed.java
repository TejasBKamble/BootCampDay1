package Mypackage;

import java.util.Scanner;

public class Speed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float km,mh;
	    Scanner sc= new Scanner(System.in);
			
			System.out.println("Enter a Speed in Km/h");
			km=sc.nextFloat();
			
			mh=km*1000/3600;
			
			System.out.println("Speed is :"+mh+" Metter per second");
			
			sc.close();
	}

}
