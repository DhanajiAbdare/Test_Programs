package Moc_Programs;

import java.util.Arrays;

// Anagram string contains the same characters & may have same order/different order

public class AnagramString {

	public static void main(String[] args) {

		String s1 = "SWARA";
		String s2 = "AASWR";

		// convert the strings into lower case for easy comparison
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
// Checking for the length of the string
		if(s1.length()!=s2.length())
		{
			System.out.println(" Both the strings are not 'Anagram String'");
		}
		
		//Convert the both the strings into character array
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		
		//Sorting using inbuilt sort function of the Arrays class
		Arrays.sort(c1);
		Arrays.sort(c2);
		
// Compare both the sorted arrays using inbuilt equals() function
		if(Arrays.equals(c1,c2)==true)
		{
			System.out.println(" Both the strings are 'Anagram String'");
		}
		else {
			System.out.println(" Both the strings are not 'Anagram String'");
		}
	}
}
