package JavaPkg;

// check if 'Salon' is a palindrome
public class G_Palindrome {

	public static void main(String[] args) {
		
		String text= "salon";  // try 'pap' as well
		String x= "";
		int length_txt= text.length();
		
		for(int i=length_txt; i>=1; i--)
		{
			char letter= text.charAt(i-1);
			x= x+letter;	
			
		}
if (x==text)  //or x.equalsIgnoreCase(text)
		{
	System.out.println(" text is a palindrome");
		}

else
{
	System.out.println(" text is NOT a palindrome");	
}
		}

}
