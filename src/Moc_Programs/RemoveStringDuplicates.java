package Moc_Programs;

import java.util.Scanner;

public class RemoveStringDuplicates {

public static void main(String[] args) {
		
		System.out.print(" Enter any string to remove string duplicates : ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char c[] = s.toCharArray();
		int index=0;
		int i=0, j=0;
		
		for(i=0; i<c.length; i++)
		{
			for(j=0; j<i; j++)
			{
				if(c[i]==c[j])
				{
					break;
				}
			}
			if(i == j)
			{
				c[index]=c[i];
				index++;
			}
		}
		System.out.print("\n String without duplicate characters :");
		for(int k=0; k<index; k++)
		{
			System.out.print(" "+c[k]);
		}
	}

}
