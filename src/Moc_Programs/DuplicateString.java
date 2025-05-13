package Moc_Programs;

//Duplicate strings in a given array :name
//Duplicate strings in a given array :name
//Duplicate strings in a given array :title

public class DuplicateString {

	public static void main(String[] args) {
		
		String a[] = { "name", "title", "name", "description", "name", "Title", "title"};
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<i; j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("\n Duplicate strings in a given array :"+a[i]);
					break;
				}
			}
		}
		


	}

}
