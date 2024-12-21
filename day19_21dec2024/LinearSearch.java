import java.util.ArrayList;

public class LinearSearch {
	// 1. LS can be used on unsorted or sorted data whereas Binary search only works on sorted data //
	// 2. LS worst-case time complexity is O(n) and BS worst-case time complexity is  O(log n) //
	// 3. BS is more efficient than LS, especially on large datasets, due to its logarithmic time complexity.
	/* 4. LS search method is: Sequential (one by one), 
	      BS search method is: Divide and conquer (halves the search space)*/
	public static void main(String[] args) {
		int arr[] = {1,3,5,7,18,9,5};
		int target1 = 18;
		System.out.println(linearSearch(arr, target1, 0));
		int target2 = 5;
		ArrayList<Integer> list =findAllIndex(arr, target2, 0, new ArrayList<>());
		System.out.println(list);
	}
	
	private static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
		if(index == arr.length) {
			return list;
		}
		if(arr[index]==target) {
			list.add(index);
		}
		return findAllIndex(arr, target, index+1,list);
				
	}

	private static int linearSearch(int[] arr, int target, int index) {
		if(index == arr.length) {
			return -1;
		}
		if(arr[index] == target) {
			return index;
		}else {
			return linearSearch(arr, target, index+1);
		}		
	}

}
