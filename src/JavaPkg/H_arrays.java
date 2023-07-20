package JavaPkg;

// Create an array that holds 5 values and print them out to the screen.
public class H_arrays {

	public static void main(String[] args) { 
		
		int a[]= new int[5];
		a[0]= 1;
		a[1]= 2;
		a[2]= 3;
		a[3]= 4;
		a[4]= 5; 
		
	   // int a[]= {1,2,3,4,5};  // Is a simpler format to create and array where memory is dynamically allocated
		
		int count= a.length;
		for (int i=0; i<count; i++)
		{
			System.out.println(" Value in arrays: " + a[i]);
		}
		
     // now display the value stored in index 2
		
		System.out.println("");
		System.out.println("Index 2 has the value of: " + a[2]);
		
	// At which index is the value 4 stored at ?
		for (int j=0; j<count; j++)
		{
			int number= a[j];
			if (number == 5)
			{
				System.out.println("Number: " +number + " is at the index of: " + j);
				break;
			}
		}
		
		}
		
	}


