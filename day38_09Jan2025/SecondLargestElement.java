public class SecondLargestElement {
    public static void main(String[] args) {
        // Example input array
        int[] arr = {0,0,10,9,11,17,19,6};

        // Call function to find second largest element
        int result = findSecondLargest(arr);
        
        // Print the result
        System.out.println(result);
    }
    
    public static int findSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            return -1; // If array is empty or has less than 2 elements
        }

        // Initialize variables for the largest and second largest
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        boolean foundDistinct = false;

        // Traverse the array to find the largest and second largest elements
        for (int num : arr) {
            if (num > first) {
                second = first; // Update second largest
                first = num;    // Update largest
                foundDistinct = true; // Mark that we found a distinct element
            } else if (num > second && num != first) {
                second = num; // Update second largest
                foundDistinct = true; // Mark that we found a distinct element
            }
        }

        // If no distinct second largest element is found, return -1
        return (second == Integer.MIN_VALUE) ? -1 : second;
    }
}
