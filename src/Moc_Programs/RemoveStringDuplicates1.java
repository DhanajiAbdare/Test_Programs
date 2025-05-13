package Moc_Programs;

public class RemoveStringDuplicates1 {

public static void main(String[] args) {
		
		String a[] = {"name", "title", "name", "title", "description"};
		int index=0;
		
		System.out.print(" Array with duplicte string :");
		for(int i=0; i<a.length; i++)
		{
			int flag = 0;
			for(int j=0; j<i; j++)
			{
				if(a[i]==a[j])
				{
					flag = 1;
					break;
				}
			}
			if(flag==0)
			{
				a[index]=a[i];
				index++;
			}
			System.out.print(" "+a[i]);
		}
		
		System.out.print("\n\n Array without duplicte string :");
		for(int k=0; k<index; k++)
		{
			System.out.print(" "+a[k]);
		}
	}

}
