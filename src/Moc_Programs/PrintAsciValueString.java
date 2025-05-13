package Moc_Programs;

public class PrintAsciValueString {

public static void main(String[] args) {
		
		String s = "Hello World";
		
		int asciValue = 'A';		//For integer data type we assigning any character
		System.out.println(" Asci value of 'A':"+asciValue);		//65
		
		System.out.println("\n Asci values of the given string :");	//72 101 108 108 111 32 87 111 114 108 100
		for(int i=0; i<s.length(); i++)
		{
			asciValue = s.charAt(i);
			System.out.print(" "+asciValue);
		}
	}

}
