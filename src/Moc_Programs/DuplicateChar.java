package Moc_Programs;

import java.util.Scanner;

//Enter the string to count duplicates :dhananjay
//String Duplicates :a
//String Duplicates :n
//String Duplicates :a

public class DuplicateChar {

	public static void main(String[] args) {
		
		System.out.print(" Enter the string to count duplicates :");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
//		char c[] = s.toCharArray();
		char c[] = s.toLowerCase().toCharArray();	//first convert the lower case then convert into character array
		
		for(int i=0; i<c.length; i++)
		{
			for(int j=0; j<i; j++)
			{
				if(c[i]==c[j])			//Check both the characters are equal or not
				{
					System.out.print("\n String Duplicates :"+c[i]);
					break;				//Immediate break after print duplicate value
				}
			}
		}

	}

}
