package Moc_Programs;

import java.util.Scanner;

public class NumberSum {

	public static void main(String[] args) {
		
		System.out.print("\n Enter any number to calculate the sum of digits :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0, rem = 0;
		
		while(n!=0)			//Loop iterate until the while condition is true
		{
			rem = n%10;		//3	 2	1	Modular division will extract the last digit
			sum = sum +rem;	//3	 5	6
			n = n/10;		//12 1	0	Division operator will eliminate last digit
		}
		System.out.println("\n Sum of the digits :"+sum);
	}

}
