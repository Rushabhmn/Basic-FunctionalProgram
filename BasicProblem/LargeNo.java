package BasicProblem;

import java.util.Scanner;

public class LargeNo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		for(;;) {
		System.err.println("Enter value");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
	/*	if(a>b && a>c) {
			System.err.println("a is big="+a);
		}
		else if(b>a && b>c)
		{
			System.err.println("b is big="+b);
		}
		else
		{
			System.err.println("c is big="+c);
		}*/
	  int r= (a>b)?(a>c?a:c):(b>c?b:c);
	  System.err.println(r);
	}}

}


