package Moc_Programs;

import java.util.Scanner;

public class MinMaxNumber {

	public static void main(String[] args) {
		
		int a[] = { 25, 100, 37, 45, 7, 10, 50, 2};
		int min = a[0], max = a[0];			 // Initialize min and max with the first element
		
		for(int i=0; i<a.length; i++)		 // Find min and max
		{
			if(min > a[i])
				min = a[i];
			else if(max < a[i])
				max = a[i];
		}
		System.out.println("\n Minimum Number :"+min);
		System.out.println("\n Maximum Number :"+max);		
		
//		int a[] = { 25, 100, 37, 45, 7, 10, 50, 2};
//		int min = a[0], max = a[0];
//		
//		for(int i=0; i<a.length; i++)
//		{
//			if(min > a[i])
//				min = a[i];
//		}
//		for(int i=0; i<a.length; i++)
//		{
//			if(max < a[i])
//				max = a[i];
//		}
//		System.out.println("\n Minimum Number :"+min);
//		System.out.println("\n Maximum Number :"+max);	
	}
}
	


		// Ask user how many numbers they want to input at run time
//				System.out.print("Enter the number of elements: ");
//				Scanner sc = new Scanner(System.in);     	//System.in is a built-in InputStream object in Java.It gets the data from the standard input device (keyboard).   
//		        int n = sc.nextInt();
//		        int a[] = new int[n];
//
//		        // Input elements
//		        System.out.println("Enter " + n + " integers:");
//		        for (int i = 0; i < n; i++) 
//		        {
//		            a[i] = sc.nextInt();
//		        }
//
//		        // Initialize min and max with the first element
//		        int min = a[0], max = a[0];
//
//		        // Find min and max
//		        for (int i = 0; i < a.length; i++) {
//		            if (min > a[i])
//		                min = a[i];
//		            else if (max < a[i])
//		                max = a[i];
//		        }
//
//		        // Output results
//		        System.out.println("\nMinimum Number: " + min);
//		        System.out.println("Maximum Number: " + max);
//		   
//			}
//		}
