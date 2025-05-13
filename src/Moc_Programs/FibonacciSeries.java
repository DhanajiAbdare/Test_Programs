package Moc_Programs;

// Fibonacci Series :0 1 1 2 3 5 8 13 21 34

public class FibonacciSeries {

public static void main(String[] args) {
		
		int n1=0, n2=1;
		int n3;
		System.out.print("Fibonacci Series :" +n1+ " " +n2);
		for(int i=3; i<=10; i++)
		{
			n3=n1+n2;
			System.out.print(" " +n3);
			n1=n2;
			n2=n3;			
		}
	}

}
