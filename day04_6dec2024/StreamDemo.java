import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamDemo {

	public static void main(String[] args) {
		System.out.println("Find the longest string in a list of strings.");
		longestString();
		
		System.out.println("Find the kth smallest element in an array.");
		smallestElementAtPosition(4);
	}

	private static void smallestElementAtPosition(int k) {
		int[] array = {4, 2, 7, 1, 5, 3, 6, 9};
		
		int kthSmallest = Arrays.stream(array)
		                       .sorted()
		                       .skip(k - 1)
		                       .findFirst()
		                       .orElse(-1);
		
		System.out.println(k +"th"+" smallest value is "+ kthSmallest);
	}

	private static void longestString() {
		List<String> strings = Arrays
	              .asList("apple", "banana", "cherry", "date", "grapefruit");
		Optional<String> longestString = strings
	              .stream()
	              .max(Comparator.comparingInt(String::length));
		
		System.out.println(longestString);
		
	}
	
	// Practice more using below link-
	// https://medium.com/@mehar.chand.cloud/java-stream-coding-interview-questions-part-1-dc39e3575727

}
