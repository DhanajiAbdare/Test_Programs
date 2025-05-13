package Moc_Programs;

public class CountUpperLowerChar {

	public static void main(String[] args) {
		
		String s = "ThisIsMyWorld";
		int upper = 0;
		int lower = 0;
		
		for(int i=0; i<s.length(); i++)
		{
			//char c = s.charAt(i);
			if(s.charAt(i)>65 && s.charAt(i)<90)
				upper++;
			else
				lower++;
		}
		System.out.println("\n Upper case characters :"+upper);
		System.out.println("\n Lower case characters :"+lower);
	}

}
