package Mypackage;

import java.util.Scanner;
import java.lang.Math;
public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 // create a scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // prompt the user to enter the values of a, b, and c
        System.out.println("Enter the value of a:");
        double a = sc.nextDouble();
        System.out.println("Enter the value of b:");
        double b = sc.nextDouble();
        System.out.println("Enter the value of c:");
        double c = sc.nextDouble();

        // calculate the value of delta
        double delta = b * b - 4 * a * c;

        // check if delta is negative, zero, or positive
        if (delta < 0) {
            // delta is negative, so there are no real roots
            System.out.println("The equation has no real roots.");
        } else if (delta == 0) {
            // delta is zero, so there is one real root
            double root = -b / (2 * a);
            System.out.println("The equation has one real root: " + root);
        } else {
            // delta is positive, so there are two real roots
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("The equation has two real roots: " + root1 + " and " + root2);
        }

        // close the scanner object
        
        sc.close();
			

			
			

	}



}
