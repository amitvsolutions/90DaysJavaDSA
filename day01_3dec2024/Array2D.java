package com.demo.arrays;

public class Array2D {

	public static void main(String[] args) {
		int arr [][] = {{2,4,6}, {1,3,9}, {5,7,8}};		
		
		System.out.println("Print 2D Array.......");
		print2DArray(arr);
		
		System.out.println("Print value of 2nd row and 1st column element i.e arr[1][0]");
		System.out.println(arr[1][0]);
		
		System.out.println("Print first and last row ke elements only");
		printLogically(arr);
		
		System.out.println("Print last row element and last column element.");
		System.out.println(arr[arr.length-1][arr[0].length-1]);
		
		System.out.println("Print value of middle-row and middle-column element.");
		System.out.println(arr[(arr.length-1)/2][(arr[0].length-1)/2]);
		
		// Print odd/even elements of an array //
	    System.out.println("Print even elements of 2D Array");
	    for(int i=0; i<arr.length; i++) {
		   for(int j =0; j<arr[i].length; j++) {
			   if(arr[i][j]%2==0) {
				   System.out.print(arr[i][j]+" ");
			   }else {
				   System.out.print("  ");
			   }
		   }
		   System.out.println("");
	    }
	}

	private static void printLogically(int[][] arr) {
		for(int row=0; row<arr.length; row++) {           		// outer loop
			for(int col=0; col<arr[row].length; col++) {        // inner loop
				if(row==0 || row == arr.length-1)
					System.out.print(arr[row][col]+ " ");
			}
			System.out.println(" ");
		}
		
	}

	private static void print2DArray(int [][] arr) {		
		for(int row=0; row<arr.length; row++) {           		
			for(int col=0; col<arr[row].length; col++) {				
				System.out.print(arr[row][col]+ " ");
			}
			System.out.println(" ");
		}	
		
	}

}
