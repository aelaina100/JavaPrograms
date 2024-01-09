package JavaPkg;
//  A- Create an array that holds 5 values and print them out to the screen.

public class H_arrays {
	public static void main (String[] args)
	{
	
		int numbers[]= new int[5];
		numbers[0]= 10;
		numbers[1]= 11;
		numbers[2]= 22;
		numbers[3]= 33;
		numbers[4]= 44;
		// Now, the only way to print out the values stored in an array, is by looping through them.
		for(int i=0; i< numbers.length  ;i++)
		{
		   System.out.println(numbers[i]);
		   
		}
		System.out.println("######################################################################################################");
		
		// Another equally valid way of creating this array (and later printing out its values) is as follows:
		int values[]= {13,23,33,43,53};
		for(int i=0; i <values.length; i++)
		{
			System.out.println(values[i]);
		}
		System.out.println("######################################################################################################");
		
	//  B- Display the value stored at index 2 
		System.out.println("Value stored at index 2 is: ");
		System.out.println(values[2]);
			
		System.out.println("######################################################################################################");
       
	//	 At which index is the value of 'some number' stored at ?  (Do this later for an array of strings).
		int someNumber= 58;
		int counter = 0;
		for(int i=0; i<values.length; i++)
		{
			int z= values[i];
			counter++; // I made a mistak of storing it inside the first if below
			
			if(z==someNumber)
			{
				System.out.println("The value: " + someNumber+ " is stored in the index of:  " +i);
				break;}

           else if(counter==values.length) {  // if you are on the last iteration
		   System.out.println("The value of: " + someNumber+ " is NOT stored in the array to begin with");
					
			  }
		   }
		}
	}
		
		
	


