package Moc_Programs;

public class PrintName {
	
//Method:1 (Accessing static variable in static method)
	
//	static String s = "Dhananjay";
//	
//	public static void main(String[] args) {
//		
//		System.out.println(s);
//
//	}
	
	
//Method:2 (Accessing non-static variable in static method)
	
//	The main method is static, and you cannot directly access non-static members from a static context
//	Because non-static members belong to an instance (object) of the class.
	String s = "Dhananjay";
	public static void main(String[] args)
	{
		PrintName name = new PrintName();	// create object
		System.out.println(name.s);			// access instance variable via object
	}
}
	
	
	
//Print the value of i variable 

//	public static void main(String[] args)
//	{
//		int x = test();
//		System.out.println("\n Return value of i variable :"+x); 	//Return value of i variable :3
//	}
//	
//	@SuppressWarnings("finally")
//	public static int test() {
//		int i=0;
//		try {
//			i++;
//			throw new NullPointerException();
//		}catch(NullPointerException ex) {
//			return i++;
//		}finally {
//			return ++i;
//		}
//	}
//}

 