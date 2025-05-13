package Moc_Programs;

import java.util.Scanner;

public class DuplicateNum_Runtime {

	public static void main(String[] args) {

        // Input size of the array
        System.out.print("Enter the number of elements in the array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Declare the array to store integer values
        int a[]  = new int[n];

        // Accept array elements from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Check for duplicates
        System.out.println("\nFrequent/duplicate numbers in the array:");
        for (int i = 0; i < a.length; i++) 
        {
            for (int j = 0; j < i; j++) 
            {
                if (a[i] == a[j]) 
                {
                    System.out.println(a[i]);
                    break; 						// Stop checking after finding the first duplicate
                } 
            }
        }

        sc.close();

	}

}
