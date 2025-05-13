package Moc_Programs;

import java.util.Scanner;

public class Number_DigitCount {

	public static void main(String[] args) {
		
		System.out.print("\n Enter any number to count the digits :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		
		while(n!=0)
		{
			n=n/10;			//Division operator will eliminate the last digit every time loop iterate
			count++;
		}
		System.out.println("\n Total digits in a number :"+count);
	}
}
