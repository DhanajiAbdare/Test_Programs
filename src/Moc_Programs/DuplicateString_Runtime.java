package Moc_Programs;

import java.util.Scanner;

public class DuplicateString_Runtime {

	public static void main(String[] args) {
		
		// Input size of the array
        System.out.print("Enter the number of elements in the array: ");
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());			// Read the whole line for safe input- 1 change

        // Declare the array to store string value
        String a[] = new String[n];							// 2 change

        // Accept array elements from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLine();							// 3 change
        }

        // Check for duplicates
        System.out.println("\nFrequent/duplicate strings in the array:");
        for (int i = 0; i < a.length; i++) 
        {
            for (int j = 0; j < i; j++) 
            {
                if (a[i].equals(a[j])) 						// Use equals() method for string comparison- 4 change
                {
                    System.out.println(a[i]);
                    break; 									// Stop checking after finding the first duplicate
                } 
            }
        }

        sc.close();
	}

}
