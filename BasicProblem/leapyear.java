package BasicProblem;

import java.util.Scanner;

public class leapyear {
	  

	public static void main(String[] args) {
		 
         Scanner sc=new Scanner(System.in);
         
         System.out.println("for leap year enter 4 digit");
         
         int ly=sc.nextInt();
         if (ly>= 1000 && ly <= 9999) {
             System.out.println("Valid input. You entered a 4-digit number: " + ly);
             
             if(ly%4==0 && ly%100!=0 || ly%400==0) {
             	System.out.println("its a leap year ");
             }
             else {
             	System.err.println("its not a leap year");
             	
             }
            
         } else {
             System.out.println("Invalid input. Please enter a 4-digit number.");
         }
        
      
	}
}
