package Moc_Programs;

public class CountVowels {

	public static void main(String[] args) {
		
		String s = "HelloDhananjay";
		int count = 0;
		
		for(int i=0; i<s.length(); i++)						// Iterate the string to count vowels
		{
			char ch = Character.toLowerCase(s.charAt(i)); 	// To handle both upper case and lower case vowels.
															// The Character class wraps a value of the primitive type char in an object
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				System.out.print("\n Vowels :"+ch);
				count++;
			}
			else {
				System.out.print("\n Consonants :"+ch);
			}
		}
		System.out.println("\n\n Count of vowels in a given string :"+count);
	}

}
