package com.demo.arrays;

import java.util.Arrays;

public class ArrayMinMax{
	
	public static void main(String[] args){
		int[] items = { 10, 0, 30, 2, 7, 5, 90, 76, 100, 45, 55 };   // Min = 0, Max = 100
		
		System.out.println(getMaxValue(items));
		System.out.println(getMinValue(items));

	}

	public static int getMinValue(int[] items) {
		// Approach-1
		int max = items[0];
		int min = items[0];

		for (int i = 1; i < items.length; i++) {
			if(items[i]>max){
				max= items[i];
			}else if(items[i]<min){
				min =items[i];
			}
		}
		
		// Approach-2
		int mx = Arrays.stream(items).max().getAsInt(); // 100
		int mn = Arrays.stream(items).min().getAsInt(); // 0
		System.out.println("Max: "+mx+" and Min: "+ mn);
		return min;
		
	}

	public static int getMaxValue(int[] items) {
		// Approach-1
		int max = items[0];
		int min = items[0];

		for (int i = 1; i < items.length; i++) {
			if(items[i]>max){
				max= items[i];
			}else if(items[i]<min){
				min =items[i];
			}
		}
		
		// Approach-2
		int mx = Arrays.stream(items).max().getAsInt(); // 100
		int mn = Arrays.stream(items).min().getAsInt(); // 0
		System.out.println("Max: "+mx+" and Min: "+ mn);
				
		return max;
		
	}
	
	// Puesdocode for Approach-1
	/*Initialize the max and min with first item in the array
          Iterate the array from second position (index 1)
	  Compare the ith item with max and min
	    if current item is greater than max
		set max = current item
	    elseif current item is lower than min
	 	set min = current item*/

}
