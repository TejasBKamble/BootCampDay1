package Mypackage;

import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int second,minuts,hours,s;
		
		 System.out.println("Enter a Seconds ");
		 second=sc.nextInt();
		 
		 hours= second / 3600;
		 minuts=(second % 3600)/60;
		 s=second % 60;
		 
		
		 System.out.println(second+" Seconds = "+hours+" Hours ,"+minuts+" Minuts , and "+s+" Seconds");
		 
		 sc.close();
	}

}
