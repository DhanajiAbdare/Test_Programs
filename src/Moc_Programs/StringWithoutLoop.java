package Moc_Programs;

//Print the string 100 times without using loop & recursion 
//i.e. Static way we are using in this program

public class StringWithoutLoop {

	public static void main(String[] args) {
		
		String s1 = " Dhananjay \n";
		String s2 = s1+s1;
		String s5 = s2+s2+s1;
		String s10  = s5+s5;
		String s100 = s10+s10+s10+s10+s10;
		
		System.out.println(s100);

	}

}
