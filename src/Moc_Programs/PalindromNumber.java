package Moc_Programs;

// Entered number and its reverse are same

public class PalindromNumber {

	public static void main(String[] args) {

		int n = 5445;
		int original = n;
		int rem = 0, sum = 0;
		
		while(n!=0)
		{
			rem = n%10;					// 5   4  4   5
			sum = (sum*10) + rem;		// 5   54 544 5445  => sum variable store reverse value
			n = n/10;					// 544 54 5   0
		}
		if(original==sum)
			System.out.println("\n Entered number is Palindrome ");
		else 
			System.out.println(" Entered number is not Palindrome ");
		
		System.out.println(" Reverse number :"+sum);
	}

}
