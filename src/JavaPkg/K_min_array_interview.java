package JavaPkg;
//From the below matrix, print out the minimum number
 
/*    2 4 5
      3 4 7
      1 2 9
 */

public class K_min_array_interview {

	public static void main(String[] args) {
		int matrix[][]  = {{2,4,5},{3,4,7},{1,2,9}};
		int minimum = matrix[0][0];
		
		for(int i=0; i<3;i++)
		{
			for (int j=0; j<3; j++)
			{
				if (minimum >matrix[i][j])
				{
					 minimum=matrix[i][j];    // If any number is smaller than me, then replace me 
				}
			}
		}
		System.out.println("The smallest number in the matrix is: " + minimum);

	}

}
