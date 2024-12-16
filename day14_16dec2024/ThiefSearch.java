public class ThiefSearch {
    
    // A function to simulate searching the caves for the thief using backtracking
    public static boolean searchCaves(int[] caves, int currentCave) {
        // If we have searched all caves and still haven't found the thief
        if (currentCave >= caves.length) {
            return false; // No more caves to search, and thief is not found
        }

        System.out.println("Searching Cave " + (currentCave + 1));

        // If we find the thief in the current cave
        if (caves[currentCave] == 1) {
            System.out.println("Thief found in Cave " + (currentCave + 1));
            return true; // Thief found, stop searching
        }

        // Backtrack: The thief is not in the current cave, move to the next cave
        return searchCaves(caves, currentCave + 1); // Recursively search the next cave
    }

    // Main function to simulate the search
    public static void main(String[] args) {
        // 1 means the thief is in that cave, 0 means no thief
        int[] caves = {0, 0, 1}; // Thief is in Cave 3 (index 2)

        // Start searching from Cave 1 (index 0)
        boolean found = searchCaves(caves, 0);

        // If the thief was not found, print a message
        if (!found) {
            System.out.println("The thief was not found in any cave.");
        }
    }
}
