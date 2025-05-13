package Moc_Programs;

//Frequent/duplicate numbers in a array :2
//Frequent/duplicate numbers in a array :4


public class DuplicateNum {

	public static void main(String[] args) {
		
		int a[] = {2,2,3,4,4,5,1};
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<i; j++)
			{
				if(a[i]==a[j])			//If 2==2 & 4==4 then print the value
				{
					System.out.println("\n Frequent/duplicate numbers in a array :"+a[i]);
					break;
				}
			}
		}

	}

}
