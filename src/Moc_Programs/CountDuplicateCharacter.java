package Moc_Programs;

public class CountDuplicateCharacter {

public static void main(String[] args) {
		
		String s = "Dhananjay";
		int count = 0;
		
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)=='a')
			{
				count++;
			}
		}
		System.out.println("\n Occurance/Count of char 'a' in given string :"+count);
	}

}
