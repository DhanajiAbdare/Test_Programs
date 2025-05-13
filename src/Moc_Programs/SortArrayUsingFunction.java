package Moc_Programs;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayUsingFunction {

	public static void main(String[] args) {
		
//		int a[] = {7, 3, 9, 5, 2};
		Integer a[] = {7,3,9,5,2};		//If you want to use Collections.reverseOrder(), you must use Integer[]
										//The Integer class wraps a value of the primitive type int in an object. 
										//An object of type Integer contains a single field whose type is int.
		
//		Invoking sort method of Arrays class. It will sort in ascending order.
		// Sort in ascending order
		Arrays.sort(a);
		
		System.out.print("\n Array in Ascending order :");
		for(int i=0; i<a.length; i++)
		{
			System.out.print(" "+a[i]);
		}
		
//		Invoking reverseOrder() method of collections class for descending order
		// Sort in descending order
		Arrays.sort(a, Collections.reverseOrder());
		System.out.print("\n Array in Descending order :");
		for(int i=0; i<a.length; i++)
		{
			System.out.print(" "+a[i]);
		}
		
		
//		Instead of using reverseOrder() method, first sort in ascending & then reverse the array. Like below
//		int[] a = {7, 3, 9, 5, 2};
//		Arrays.sort(a); 			
//		System.out.print("\n Descending order :");
//		for (int i = a.length - 1; i >= 0; i--) 
//		{
//		    System.out.print(" " + a[i]);
//		}
	}
}
