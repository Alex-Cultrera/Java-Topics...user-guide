package com.coderscampus.arrays;


public class Arrays {

	public static void main(String[] args) {
		// Arrays are one type of data structure
		// Arrays can store multiple objects inside one variable 
			
		// One-dimensional arrays (linear structure / sequential storing into contiguous memory locations):
		
		// Two ways of assigning values to the array:
		
		
			// During array declaration		
			int[] gradesA = {36, 5, 24, 78, 99};
			// note: when assigning values during an array declaration, 
			// you don't need to specify the array size because compiler automatically specifies it 
			
		
			// After array declaration, one by one, by specifying the index number
			int[] gradesB = new int[5];
			gradesB [0] = 36;
			gradesB [1] = 5;
			gradesB [2] = 24;
			gradesB [3] = 78;
			gradesB [4] = 99;
		
		
			// method to calculate the length of an array
			int theLength;
			theLength = gradesB.length;
			System.out.println(theLength);
			System.out.println("------------------");
		
			
			// Conditional Looping
			for (int i = 0; i < gradesB.length; i++) {
				if (gradesB[i] == 24) {
					break;
				}
				System.out.println (gradesB[i]);
				System.out.println("------------------");
			}
			
			
			// Enhanced For Loop or the "For-Each Loop"
			// Syntax below
			/*
			for(data_type loop_variable : collection) {
				//body of the loop
			}
			*/
			// Example below
			
			int[] numbersArray = {6, 75, 3, 16, 22, 90};
			for(int number : numbersArray) {
				System.out.println(number);
				System.out.println("------------------");
			}
		
		
		
			// 2D, and Multidimensional arrays or N-dimensional 
			// aka Array of Arrays
			// representation of the elements is in rows and columns
			
			// 2D Arrays syntax:
			// data_type[][] array_name = new data_type[rows[columns];
			// 2D Arrays are tables with 'i' rows and 'j' columns
			// the row number ranges from 0 to (i-1) and column number ranges from +0 to (j-1)
			// each element can be indexed as [i, j] where 'i' is the position of the row and 'j' is the position of the column

			int [] [] numbersA = new int [2][2];
			// thus 'numbers' is a 2D integer array with 2 rows and 2 columns
			// array_name[row_index][column_index] = value;
			numbersA[0][0]=2;
			numbersA[0][1]=3;
			numbersA[1][0]=4;
			numbersA[1][1]=2;
			
			// or 
			
			int[][] numbersB = {{2,3},{4,2}};
			System.out.println("Element at [0,0]: " + numbersB[0][0]);
			System.out.println("Element at [0,1]: " + numbersB[0][1]);
			System.out.println("Element at [1,0]: " + numbersB[1][0]);
			System.out.println("Element at [1,1]: " + numbersB[1][1]);
			System.out.println("------------------");
			
			
			// Fetch values from 2D arrays
			for (int i=0; i<2; i++) {
				for (int j=0; j<2;j++) {
					System.out.println(numbersB[i][j]);
				}
			}
			System.out.println("------------------");
			
			
			// Multidimensional Arrays
			// Syntax:
			//	data_type [dim1][dim2]...[dimN] array_name = new data_type[dim1_size_[dim2_size]...[dimN_size];
			// Example:
			
			int[][][]intArray= {{{11,12},{14,15},{17,18}},{{21,22},{24,25},{27,28}},{{31,32},{34,35},{37,38}},};
			System.out.println("Following are the elements of the 3D array");
			for(int i=0; i<3;i++){
				for(int j =0; j<2;j++) {
					for(int k=0;k<2;k++)
						System.out.println("intArray ["+i+"]["+j+"]["+k+"]="+intArray[i][j][k]);
				}
			}
			
			
	}

}
