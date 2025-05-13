package Moc_Programs;

public class OddNumber {

	public static void main(String[] args) {
		
		System.out.println(" Odd numbers between 1 to 50 are :");
		int count=0;
		
		for(int i=1; i<=50; i++)
		{
			if(i%2!=0)
			{
				System.out.print(" "+i);
				count++;
			}
		}
		System.out.print("\n\n Total odd numbers :"+count);
	}

}
