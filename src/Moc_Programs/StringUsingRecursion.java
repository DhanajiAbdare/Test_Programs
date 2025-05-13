package Moc_Programs;

//Print the entered string 100 times using recursion function

public class StringUsingRecursion {

	public static void main(String[] args) {	
		printName(100);					//Call recursive function: printName
	}
	public static void printName(int n)	//Recursive function implementation
	{
		if(n>0)
		{
			System.out.println(" Dhananjay ***** "+n);
			n--;
			printName(n);
		}
	}
	
//	public static void main(String[] args) {
//		printName(1);
//	}
//	public static void printName(int n)
//	{
//		if(n<=100)
//		{
//			System.out.println(" Dhananjay ***** "+n);
//			n++;
//			printName(n);
//		}
//	}

}
