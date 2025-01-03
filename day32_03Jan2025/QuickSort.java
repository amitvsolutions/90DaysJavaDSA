import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {5, 4, 7, 9, 2, 1};
        quickSort(arr, 0, arr.length - 1);  // Start sorting from the entire array
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    // QuickSort function
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Find pivot element such that element smaller than pivot are on left
            // and greater elements are on right
            int pivotIndex = partition(arr, low, high);
            
            // Recursively sort the sub-arrays
            quickSort(arr, low, pivotIndex - 1);  // Left sub-array
            quickSort(arr, pivotIndex + 1, high); // Right sub-array
        }
    }

    // Partition the array into two parts and return the index of pivot element
    private static int partition(int[] arr, int low, int high) {
        // Use the last element as the pivot
        int pivot = arr[high];
        int i = low - 1;  // i is the index of the smaller element

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {  // If current element is smaller than pivot
                i++;  // Increment index of smaller element
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap the pivot element with the element at i+1
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        // Return the partitioning index
        return i + 1;
    }
}

