import java.util.Arrays;

public class PushZeroToEnd {
    public static void main(String[] args) {
        int arr[] = {1, 2, 0, 5, 7, 0, 3, 0};
        pushZerosToEnd(arr);
    }

    static void pushZerosToEnd(int[] arr) {
        int index = 0;  // Pointer to track the next non-zero position

        // Move through the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                // If the current element is non-zero, swap it with the element at 'index'
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                
                // Move the 'index' pointer to the next position
                index++;
            }
        }

        // Print the modified array
        System.out.println(Arrays.toString(arr));
    }
}

