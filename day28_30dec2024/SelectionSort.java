package com.demo.recursion;

import java.util.Arrays;

public class SelectionSort {
	//Compare adjacent elements and swap them if needed in each pass through the array//
    public static void main(String[] args) {
    	int [] nums = {64, 34, 25, 12, 22, 11, 90};
    	
    	int r=nums.length-1; int c= 0; int max=0;
    	selectionSort(nums, r,c, max);
    	System.out.println(Arrays.toString(nums));
    }
	private static void selectionSort(int[] nums, int r, int c, int max) {
		if(r==0) {
			return;
		}
		if(c<r) {
			if(nums[c]>nums[max]) {
				selectionSort(nums, r, c+1, c);
			}else {
				selectionSort(nums, r, c+1, max);
			}
		}else {
			int temp = nums[max];
			nums[max] = nums[r-1];
			nums[r-1] = temp;
			selectionSort(nums, r-1, 0, 0);
		}
		
	}
}

