package Moc_Programs;

public class PrintPattern {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++)
		{
			for(int j=0; j<i; j++)
			{
//				System.out.print(" ");
				System.out.print(j+1);	
			}
			System.out.println(" ");
		}
	}
	
}