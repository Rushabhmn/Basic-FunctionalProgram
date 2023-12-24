package BasicProblem;

import java.util.Scanner;

public class power2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.err.println("Enter the Number which you want the table of");
	int a=sc.nextInt();
	for (int i = 1; i <= 10; i++) {
		System.err.println(a*i);
		
	}
}
}
