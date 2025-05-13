package OopsPrograms;

public class StringTypes {

	public static void main(String[] args) {
		
		String s1  = "Test";
		String s2 = "Test";
		
		String s3 = new String("Test");
		String s4 = new String("Test");
		
		//check reference
		System.out.println(s1==s2);			//true
		System.out.println(s3==s4);			//false
		System.out.println(s1==s3);			//false
		System.out.println(s2==s4);			//false
		
		//check content
		System.out.println(s1.equals(s2));	//true
		System.out.println(s3.equals(s4));	//true
		System.out.println(s1.equals(s3));	//true
		System.out.println(s2.equals(s4));	//true
	}
}
