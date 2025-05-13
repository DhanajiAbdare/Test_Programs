package OopsPrograms;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		
		System.out.print(" Enter the first two letters of the day in capital letters :");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		switch(s)
		{
		case "SU": System.out.println("\n SUNDAY");
					break;
		case "MO": System.out.println("\n MONDAY");
					break;
		case "TU": System.out.println("\n TUESDAY");
					break;
		case "WE": System.out.println("\n WEDNSDAY");
					break;
		case "TH": System.out.println("\n THURSDAY");
					break;
		case "FR": System.out.println("\n FRIDAY");
					break;
		case "SA": System.out.println("\n SATURDAY");
					break;
		}
	}

}
