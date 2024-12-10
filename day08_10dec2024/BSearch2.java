import java.util.Arrays;
import java.util.Scanner;

public class BSearch2 {

	public static void main(String[] args) {
		// Given unsorted array //
		int nums [] = {2,5,4,3,7,6,8,9,20};
		
        // Create an array of indices to track original positions
        Integer[] originalIndices = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            originalIndices[i] = i; // Store the original index of each element
        }
        
        // Sort the nums array, but keep track of the original indices
        Arrays.sort(originalIndices, (a, b) -> Integer.compare(nums[a], nums[b]));
        
        // Sorting done, now we search for the target
        Scanner s = new Scanner(System.in);
        int target = s.nextInt();

        int result = binarySearch(nums, originalIndices, 0, nums.length - 1, target);
        
		if(result>=0) {
			System.out.println("Found at position: "+ result);
		}else {
			System.out.println("Not Found ");
		}
		s.close();
	}

    private static int binarySearch(int[] nums, Integer[] originalIndices, int start, int end, int target) {
        // Base case: No element to search
        if (start > end) {
            return -1;
        }

        int mid = (start + end) / 2; // Calculate the middle index

        // Check if the target is at the mid index
        if (nums[originalIndices[mid]] == target) {
            return mid;  // Return the mid index
        }

        // If target is greater, search the right half
        if (nums[originalIndices[mid]] < target) {
            return binarySearch(nums, originalIndices, mid + 1, end, target);
        }

        // If target is smaller, search the left half
        return binarySearch(nums, originalIndices, start, mid - 1, target);
    }
}
