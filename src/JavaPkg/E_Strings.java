package JavaPkg;

public class E_Strings {

	public static void main(String[] args) {
		
		String text= "WERD"; 
		text.length(); 
		// Indicating that 'text' is also an object of the class "String", used to access its methods for mainpulating strings.
		// It follows that:  String text= new String("werd"); is an equivalent line of code.Nevertheless, developers made it easier.
		// 'String' is a pre-defined/default class present in the downloaded java packages
		
		String s= "Payment $100 payed"; // Display the character that's displayed in the 8th index ?
		System.out.println(s.charAt(8));
		//char f= s.charAt(8);
		
		
		//Below: Display the index that the character "t" occupy.
		System.out.println(s.indexOf("t"));
		
		//Below: Display the substring that starts from the 6th index and onwards.
		System.out.println(s.substring(6));
		
		//Below: Display the substring that starts with 'm' and onwards.
		System.out.println(s.substring(3));
		// below: exercise- Explore the other 'Substring' method & the 'subSequence' one. *************************************************
		
		// Below" convert the 'text' string to small letters and display it on the screen
		System.out.println(text.toLowerCase());
		
		// Below" convert the 's' string to capital letters and display it on the screen.
		System.out.println(s.toUpperCase());
		
		
	
		
		
		
		
		

	}

}
