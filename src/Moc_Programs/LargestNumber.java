package Moc_Programs;

//Largest Number :50
//Smallest Number :10

// It's called ternary because it takes three operands: condition ? value_if_true : value_if_false;

public class LargestNumber {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 50;
		
		int large = a>b?a:b;			//Using ternary operator (without if-else)
//		a > b is the condition.
//		If a is greater than b, then a is assigned to large.
//		Otherwise, b is assigned to large.
		
		
		int small = a<b?a:b;			//To find the smallest number use this condition
//		a < b is the condition.
//		If a is less than b, then a is assigned to small.
//		Otherwise, b is assigned to small.
		
		
		System.out.println("\n Largest Number :" +large);
		System.out.println("\n Smallest Number :" +small);
		
	}

}
