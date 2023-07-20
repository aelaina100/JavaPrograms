package JavaPkg;
//From the below matrix, for the minimum number, print out the maximum number of its associated column 
/*  2 4 5
    3 4 7
    1 2 9
*/

	//Plan: find out the min number in this matrix.
    	// Find out its associated column.
public class M_column_of_min {
	public static void main(String [] args) {
		
		int matrix[][]= {{2,4,5},{3,4,7},{1,2,9}};
		int column_index;
		
		for(int i=0; i<3; i++)
		{
			for (int j=0; j<3; j++)
			{
				int minimum= matrix[0][0];
				
				if(matrix[i][j] < minimum)
						{
					minimum= matrix[i][j];
					
					 column_index=  j;
					}
				}
			}
		// Traverse throughout that column
	}
		
	}


