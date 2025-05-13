package Moc_Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RemoveDuplicatePrintArrayList {

public static void main(String[] args) {
		
		int a[]= {2,4,7,2,11,5,7,14,22,11,49,58,14,101,1,3,205,49,101,12};
		int index=0;
		List <Integer> alist = new ArrayList<>();
		
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
		for(int k=0; k<index; k++)
		{
			alist.add(a[k]);
		}
		
		System.out.println(" ArrayList without duplicates :"+alist);
		
		// Sort in ascending order
		Collections.sort(alist);
        System.out.println("\n ArrayList in ascending order: " + alist);
        
        // Sort in descending order
		Collections.sort(alist, Collections.reverseOrder());
		System.out.println("\n ArrayList in descending order :"+alist);
	}

}
