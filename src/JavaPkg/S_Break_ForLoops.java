package JavaPkg;

public class S_Break_ForLoops {

	public static void main(String[] args) {
		
		int numbers[]= {1,2,5,7,6,8,9,11,144};
		//Now, Ensure this array has at least one number that is divisible by 2 & display such number.
		for(int i=0; i<numbers.length; i++)
		{
			if(numbers[i]%2==0)
			{
				System.out.println(numbers[i]);
				break;   //exists our for-loop
			}	
	    }
  }}
