package BasicProblem;

import java.util.Scanner;

public class harmonic {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.err.println("Enter the Number om time N");
		int N=sc.nextInt();
		double HM =0.0;
		for (int i = 1; i <= N; i++) {
			
			HM=HM+1.0/i;
			
			System.err.print("1/"+i+" "+"+"+" ");
		
		}
		System.err.println("1/"+HM);
		
}
}