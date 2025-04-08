public class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] count = new int[n * n + 1];
        int repeated = -1, missing = -1;

        // Count occurrences of each num
        for (int[] row : grid) {
            for (int num : row) {
                count[num]++;
            }
        }

        // Identify the repeated and missing numbers
        for (int i = 1; i <= n * n; i++) {
            if (count[i] == 2) {
                repeated = i;
            } else if (count[i] == 0) {
                missing = i;
            }
        }

        return new int[]{repeated, missing};
    }
}
