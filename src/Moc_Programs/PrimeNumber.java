package Moc_Programs;

//Prime numbers between 1 to 50 are : 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47

public class PrimeNumber {

	public static void main(String[] args) {
		
		System.out.print(" Prime numbers between 1 to 50 are :");
//		int count = 0;			//Move the count variable inside the for loop so it resets every time i changes
		
		for(int i=1; i<=50; i++)
		{
			int count = 0;			
			for(int n=i; n>=1; n--)
			{
				if(i%n==0)
				{
					count++;
				}
			}
			if(count==2)		//For any prime number count update only 2 times then condition is true
			{
				System.out.print(" "+i);
			}
		}
	}

}
//	Explanation: Inner loop breakdown
//	n = 4
//	4 % 4 == 0 → divisible
//	→ count++ → count = 1
//	
//	n = 3
//	4 % 3 == 1 → not divisible
//	→ count remains 1
//	
//	n = 2
//	4 % 2 == 0 → divisible
//	→ count++ → count = 2
//	
//	n = 1
//	4 % 1 == 0 → divisible
//	→ count++ → count = 3
//	
//	Final count=3
//	(count==2) This condition fails because count == 3 for i = 4. 



