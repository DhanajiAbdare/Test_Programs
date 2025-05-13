package Moc_Programs;

import java.util.Scanner;

public class LengthString {

	public static void main(String[] args) {

//		System.out.print(" Enter the string to calculate the length :");
//		Scanner sc = new Scanner(System.in);
//		String s = sc.nextLine();
//		int count =0;
//		
//		for(int i=0; i<s.length(); i++)
//		{
//			System.out.print(" "+s.charAt(i));
//			count++;
//		}
//		System.out.println("\n Length of the string is :"+count);
//	}
//}
		
		System.out.print(" Enter the string to calculate the length :");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
	    char c[] = s.toCharArray();
	    int count = 0;
	    
	    for(char c1 : c)		// Enhance for() loop to iterate array
	    {
	    	System.out.print(" "+c1);
	    	count++;
	    }
	    System.out.println("\n Length of the string is :"+count);
	}
}
		
		
//		System.out.print(" Enter the string to calculate the length :");
//		Scanner sc = new Scanner(System.in);
//		String s = sc.nextLine();
//		char c[] = s.toCharArray();
//		
//		for(int c1 : c)			// Print the Ascci values of a string
//		{
//			System.out.print(" "+c1);
//		}
//	}}

		
