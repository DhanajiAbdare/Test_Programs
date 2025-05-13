package Moc_Programs;

//Sort the array in ascending/descending order without using any sort function

public class SortArrayWithoutFunction {

	public static void main(String[] args) {
		
		int a[] = {7,3,9,5,2};
		System.out.print("\n Array after sort in ascending/descending order :");
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)	//Inner loop that compares the i-th element with all elements to its right (from i+1 to end of the array)
			{
				if(a[i]<a[j])				//Change conditions to sort in ascending order
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.print(" "+a[i]);
		}

	}
}
