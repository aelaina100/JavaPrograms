package JavaPkg;
// Print out "Print me in reverse" in reverse.
public class F_stringInReverse {

	public static void main(String[] args) {
		// Print the below string in reverse
		String text= "Print me in reverse";
		String reversed ="";
		int textLength= text.length();
		
		for(int i=textLength; i>=1; i--)  // assume the length is 5 so is here is i=5.....i=1
		{
			char s1= text.charAt(i-1); // The argument takes an index input where i could have the value of i=0
			reversed= reversed+s1;	
		}
        System.out.println(reversed);
	}

}
