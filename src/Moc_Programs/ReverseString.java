package Moc_Programs;

public class ReverseString {

	public static void main(String[] args) {
		
		String s = "Dhananjay Abdare";
		System.out.println(" Entered string is :"+s);
		System.out.print("\n Reverse string is :");
		
		//Logic1 (Logic1 & Logic2 are almost same)
//		char c[] = s.toCharArray();
//		for(int i=c.length-1; i>=0; i--)
//		{
//			System.out.print(c[i]);
//		}
		
		//Logic2
//		for(int i=s.length()-1; i>=0; i--)
//		System.out.print(s.charAt(i));
		
		//Logic3
		String Reverse = "";
		for(int i=s.length()-1; i>=0; i--)
		{
			Reverse = Reverse + s.charAt(i);
		}
		System.out.print(Reverse);

	}

}
