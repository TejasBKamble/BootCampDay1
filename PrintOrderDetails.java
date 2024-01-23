package Mypackage;

import java.util.Scanner;

public class PrintOrderDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int od,tc,quan;
		String name;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a Order ID ");
		od=sc.nextInt();
		
		System.out.println("Enter a Order Name ");
		name=sc.next();
		
		System.out.println("Enter a Total Cost ");
		tc=sc.nextInt();
		
		System.out.println("Enter a Quantity ");
		quan=sc.nextInt();
		
		System.out.println(" Order ID "+ od +": "+ quan + " "+" of "+name+" For a Total of Rs " + quan * tc );
		
		sc.close();

	}

}
