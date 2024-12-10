import java.util.Arrays;
import java.util.Scanner;

public class BSearch {

	public static void main(String[] args) {
		// Binary-Search: Searching Algorithm applied on sorted Arrays //
		int nums [] = {2,5,4,3,7,6,8,9,20};
		Arrays.sort(nums); // Sorting is required for BSearch, for unsorted array use Linear-Search //
		System.out.println(nums);
		int start =0; int end=nums.length-1;
		
		Scanner s = new Scanner(System.in);
		int target = s.nextInt();
		
		int result= binarySeacrh(nums,start, end, target);	
		System.out.println("= "+nums[result]);
		if(result>=0) {
			System.out.println("Found at position: "+ result);
		}else {
			System.out.println("Not Found ");
		}
		s.close();
	}

	private static int binarySeacrh(int[] nums, int start, int end, int target) {
		int mid = (start+end)/2;
		if(start>end) {
			return -1;
		}
		if(target == nums[mid]) {
			return mid;
		}
		if(target>nums[mid]) {
			return binarySeacrh(nums, mid+1, end, target);
		}
		return binarySeacrh(nums, start, mid-1, target);
		
	}


}
