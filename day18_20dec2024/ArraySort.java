public class ArraySort {

	public static void main(String[] args) {
		int nums []= {1,3,5,7,9};
		System.out.println(isSorted(nums,0));
	}

	private static boolean isSorted(int[] nums, int index) {
		if(index==nums.length-1) {
			return true;
		}
		return nums[index]<nums[index+1] && isSorted(nums, index+1);
	}

}
