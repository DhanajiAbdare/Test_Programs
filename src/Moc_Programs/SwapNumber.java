package Moc_Programs;

public class SwapNumber {

	public static void main(String[] args) {
		
		int a=10, b=20;
		System.out.println(" Before swapping values are :"+a+" "+b);
		
		//Logic1 :Swap using third variable
//		int t = a;
//		a = b;
//		b = t;
//		System.out.println("\n After swapping values are :"+a+" "+b);
		
		//Logic2 :Using + & - operator(without using third variable)
		a = a+b;	//10+20=30
		b = a-b;	//30-20=10
		a = a-b;	//30-10=20
		System.out.println("\n After swapping values are :"+a+" "+b);
		
	}

}
