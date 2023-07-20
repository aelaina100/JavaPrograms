package JavaPkg;
//From the below matrix, print out the maximum number

/*  2 4 5
    3 4 7
    1 2 9
*/
public class L_maxArray_intervi {
	public static void main(String [] args)
	{
		int matrix[][]= {{2,4,5},{3,4,7},{1,2,9}};
		int max= matrix[0][0];
		for(int i=0; i<3; i++)
		{
			for (int j=0; j<3; j++)
			{
				
				if(max < matrix[i][j])
						{
					    max= matrix[i][j];
						}
			}
		}
		System.out.println("Maximum number in the matrix is: " + max);
	}

}
