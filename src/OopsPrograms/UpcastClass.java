package OopsPrograms;

public class UpcastClass {

	public static void main(String[] args) {
		
//		ParentClass parent = new ParentClass();	// parent object
//		parent.launchBrowser();
//		
//		ChildClass child = new ChildClass();	// child object
//		child.launchBrowser();
		
		ParentClass upcast = new ChildClass();	// parent refer to child object
		upcast.launchBrowser();
	}

}
