package Moc_Programs;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int n = 1234579;
		int rem = 0;
		System.out.println(" Entered number is :"+n);
		
		System.out.print("\n Entered Number in reverse order is :");
		while(n!=0)
		{
			rem = n%10;
			System.out.print(rem);
			n=n/10;
		}
	}

}
