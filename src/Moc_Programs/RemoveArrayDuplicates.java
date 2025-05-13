package Moc_Programs;

import java.util.*;

public class RemoveArrayDuplicates {

public static void main(String[] args) {
		
		int a[]= {2,2,3,3,4,5,1};
		int index=0;
		
		for(int i=0; i<a.length; i++)
		{
			int flag = 0;
			for(int j=0; j<i; j++)
			{
				if(a[i]==a[j])		// If 2=2 & 3=3, then statement breaks
				{
					flag = 1;
					break;
				}
			}
			if(flag == 0)
			{
				a[index]=a[i];		// Initialize the index value
				index++;
			}				
		}
		System.out.println(" Array without duplicate numbers :");
		for(int k=0; k<index; k++)
		{
			System.out.print(" "+a[k]);
		}
		
	
//Using SET - Remove Array Duplicates
//		 int a[] = {2, 2, 3, 3, 4, 5, 1};
//
//	        // Use LinkedHashSet to maintain insertion order
//	        Set<Integer> set = new LinkedHashSet<>();
//
//	        for (int num : a) {
//	            set.add(num);  // Duplicates are ignored automatically
//	        }
//
//	        // Print result
//	        System.out.println("Array without duplicate numbers:");
//	        for (int num : set) {
//	            System.out.print(" " + num);
//	        }
	}
}
