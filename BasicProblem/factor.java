package BasicProblem;

import java.util.Scanner;

public class factor {
	
	 public static void main(String[] args) 
	 {
	 Scanner sc =new Scanner(System.in);
	 System.out.println("Enter the number");
	 int num=sc.nextInt();
	 int i=1;
	 System.out.println("Factors is:");;
	/* while(i<=num)
	 {
	 if(num%i==0)
	 System.out.print(i+" ");
	 i++;
	 } */
	 for (int j = 1; j <= num; j++) 
	 {
		 if(num%j==0)
		 {
			 System.err.print(j+" ");
		 }
		
	}
	 }
	}

