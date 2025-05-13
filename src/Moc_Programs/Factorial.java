package Moc_Programs;

import java.util.Scanner;

public class Factorial {

	public static void main (String[] args)
	{
		System.out.print(" Enter any number to find the factorial :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fact = 1;
		for(int i=1; i<=n; i++)
		{
			fact = fact*i;
//			fact *= i;
		}
		System.out.println("\n Factorial :"+fact);		
	}
}
