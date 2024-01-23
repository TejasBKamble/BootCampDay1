package Mypackage;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
			
		String sname;
		int Physics,Chemistry,Mathematics,totalMark;
		float totalPer;
		
        Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a Student Name ");
		sname=sc.next();
		
		System.out.println("Enter a Physics Marks out fo 100 ");
		Physics=sc.nextInt();
		
		System.out.println("Enter a Chemistry Marks out fo 100 ");
		Chemistry=sc.nextInt();
		
		System.out.println("Enter a Mathematics Marks out fo 100 ");
		Mathematics=sc.nextInt();
		
		totalMark= Mathematics + Physics + Chemistry;
		
		totalPer=(totalMark / 300) * 100;		 
		
		System.out.println(sname +" obtained following % of marks in PCM :");
		
		//Physics: [% in Physics ], Chemistry : [% in Chem], Maths : [% in Maths] 
		
		System.out.println("Physics :"+ Physics +" % in Physics \n"+"Chemistry :"+Chemistry+"%in Chemistry \n"+"Mathematics :"+Mathematics+"% in Mathematics");

		System.out.println("Total :"+ (totalMark * 100) / 300);		
		
		sc.close();
	}

}
