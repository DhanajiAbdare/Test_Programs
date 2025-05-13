package Moc_Programs;

//Entered string and its reverse are same

import java.util.Scanner;

public class PalindromString {

	public static void main(String[] args) {
		
		System.out.print("\n Enter the string/number to check it is Palindrome or not :");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String Reverse = "";					// Creating string object to store reverse value
		
		for(int i=s.length()-1; i>=0; i--)
		{
			Reverse = Reverse + s.charAt(i);	// Reverse the string
		}
		
		if(s.equals(Reverse))
			System.out.println(" Entered string is palindrome ");
		else
			System.out.println(" Entered string is not palindrome");
		
		System.out.println(" Reverse string :"+Reverse);
	}

}
