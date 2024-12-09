import java.util.*;

public class HashMapDemo {

	// Function to print all duplicate characters in string 
	public static void countDuplicateCharacters(String str){

		// HashMap containing char as a key and occurrences as a value
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		// Converting given string into a char array
		char[] charArray = str.toCharArray();

		// Checking each character of charArray
		for (char c : charArray) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			}
			else {
				map.put(c, 1);
			}
		}
		for (Map.Entry<Character, Integer> entry :
			map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey()
						+ " : "
						+ entry.getValue());
			}
		}
	}

	public static void main(String args[])
	{
		String str = "abrakadabra";
		countDuplicateCharacters(str);
	}
}

