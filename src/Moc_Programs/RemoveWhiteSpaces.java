package Moc_Programs;

public class RemoveWhiteSpaces {

public static void main(String[] args) {
		
		//String str = "Today     is a      good day"
		//Output = "Today is a good day"
		//Restriction = Split, Trim, Replace, ReplaceALL -not allowed to use
		
//Method 1: Output >> Todayisagoodday
	
		String s = "Today      is a      good day";
		char c[] = s.toCharArray();
        String result = "";

        for (int i = 0; i < c.length; i++) 
        {
            if (c[i] != ' ') 		// If the character is not a space
            {
                result += c[i]; 	// Add it to the result string
            }
        }

        System.out.println("String without spaces: " + result);
        
        
     
//Method 2: Output >> Today is a good day  
        
//        boolean spaceFound = false;
//
//        for (int i = 0; i < c.length; i++) {
//            if (c[i] != ' ') 
//            {
//                result += c[i];       	// Add non-space character
//                spaceFound = false;       // Reset flag
//            } else if (!spaceFound) 
//            {
//                result += " ";            // Add one space
//                spaceFound = true;        // Set flag so more spaces are skipped
//            }
//            // if spaceFound is true and another space comes, we skip it
//        }
//        System.out.println("Normal string: " + result);
    }
}

