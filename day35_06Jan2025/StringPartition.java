import java.util.ArrayList;
import java.util.List;

public class StringPartition {
    
    public List<String> partitionLabels(String s) {
        // Step 1: Record the last occurrence index for each character
        int[] lastOccurrence = new int[26]; // for 'a' to 'z'
        for (int i = 0; i < s.length(); i++) {
            lastOccurrence[s.charAt(i) - 'a'] = i;
        }

        // Step 2: Greedily partition the string
        List<String> result = new ArrayList<>();
        int start = 0; // start of the current partition
        int end = 0;   // the end of the current partition

        for (int i = 0; i < s.length(); i++) {
            // Update the end to the farthest last occurrence
            end = Math.max(end, lastOccurrence[s.charAt(i) - 'a']);
            
            // If we reach the end of a valid partition
            if (i == end) {
                result.add(s.substring(start, i + 1));  // Add the partition as a substring
                start = i + 1;                          // Move the start for the next partition
            }
        }

        // Step 3: Check if partitioning was possible
        if (result.size() == 1 && result.get(0).equals(s)) {
            // If the entire string is the only partition, it's not valid as multiple partitions are required
            //System.out.println("Partition is not possible");
            return new ArrayList<>();
        }

        return result;
    }

    public static void main(String[] args) {
        StringPartition sp = new StringPartition();
        String s1 = "ababcbacadefegdehijhklij";
        //String s2 = "eccbbbbdec";
        String s2 = "aabbccddeedda";

        List<String> partitions1 = sp.partitionLabels(s1);
        if (partitions1.isEmpty()) {
            System.out.println("Partition is not possible");
        } else {
            System.out.println(partitions1);  // Output: [ababcbaca, defegde, hijhklij]
        }

        List<String> partitions2 = sp.partitionLabels(s2);
        if (partitions2.isEmpty()) {
            System.out.println("Partition is not possible");  // Output: Partition is not possible
        } else {
            System.out.println(partitions2);
        }
    }
}
