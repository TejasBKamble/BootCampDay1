package Mypackage;

import java.util.Random;

public class RandomOpration {

	public static void main(String[] args) {
		
		 Random random = new Random();

	        // generate two random integers between 1 and 10
	        int a = random.nextInt(10) + 1;
	        int b = random.nextInt(10) + 1;

	        // generate a random arithmetic operator (+, -, *, or /)
	        char op = '+';
	        switch (random.nextInt(4)) {
	            case 0:
	                op = '+';
	                break;
	            case 1:
	                op = '-';
	                break;
	            case 2:
	                op = '*';
	                break;
	            case 3:
	                op = '/';
	                break;
	        }

	        // print the equation and the result of the operation
	        System.out.print(a + " " + op + " " + b + " = ");
	        switch (op) {
	            case '+':
	                System.out.println(a + b);
	                break;
	            case '-':
	                System.out.println(a - b);
	                break;
	            case '*':
	                System.out.println(a * b);
	                break;
	            case '/':
	                System.out.println((double) a / b);
	                break;
	        }
	}

}
