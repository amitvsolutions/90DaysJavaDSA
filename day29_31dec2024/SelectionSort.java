package com.demo.recursion;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
    	int [] nums = {7,6,3,9};
    	
    	int r=nums.length; int c= 0; int max=0;
    	selectionSort(nums, r,c, max);
    	System.out.println("=> "+Arrays.toString(nums));
    }
	private static void selectionSort(int[] nums, int r, int c, int max) {
		if(r==1) {			
			return;
		}
		if(c<r) {
			if(nums[c]>nums[max]) {
				//System.out.println("c>max " + "c="+c+" nums[c]= "+nums[c]+ " > "+ " max="+max+" nums[max]= "+ nums[max]);
				selectionSort(nums, r, c+1, c);
			}else {
				System.out.println("c>max " + "c="+c+" nums[c]= "+nums[c]+ " < "+ " max="+max+" nums[max]= "+ nums[max]);
				selectionSort(nums, r, c+1, max);
			}
		}else {
			//System.out.println("Now c is "+c);
			System.out.println(Arrays.toString(nums));
			int temp = nums[max];
			nums[max] = nums[r-1];
			nums[r-1] = temp;
			selectionSort(nums, r-1, 0, 0);
		}
		
	}
}

