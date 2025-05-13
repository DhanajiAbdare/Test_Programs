package Moc_Programs;

public class OddEvenDigitsCount {

	public static void main(String[] args) {
		
		int n = 12345;
		
		int even_count = 0;
		int odd_count = 0;
		
		while(n!=0)				//12345 1234 123 12 1
		{
			int rem = n%10;		//Modular division will only extract the last digit 5 4 3 2 1 
			
			if(rem%2==0)		//Check the reminder
				even_count++;	//1 2 
			else
				odd_count++;	//1 2 3
			
			n = n/10;
		}
		System.out.println("\n Even digits in the given number :"+even_count);
		System.out.println("\n Odd digits in the given number :"+odd_count);
	}

}
