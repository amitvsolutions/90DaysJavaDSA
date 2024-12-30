package com.demo.recursion;

import java.util.Arrays;

public class BSort {

	public static void main(String[] args) {
    	int [] nums = {64, 34, 25, 12, 22, 11, 90};
    	
    	int r=nums.length-1; int c= 0;
    	bubbleSort(nums, r,c);
    	System.out.println(Arrays.toString(nums));
	}
	private static void bubbleSort(int[] nums, int r, int c) {
		if(r==0) {
			return;
		}
		if(c<r) {
			if(nums[c]>nums[c+1]) {
				int temp = nums[c];
				nums[c]= nums[c+1];
				nums[c+1]=temp;				
			}
			bubbleSort(nums, r, c+1);
		}else {
			bubbleSort(nums, r-1, 0);
		}
	}

}
