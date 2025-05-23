class Solution {
    public void setZeroes(int[][] matrix) {
        
    int m = matrix.length;
    int n = matrix[0].length;

    boolean[] row = new boolean[m];
    boolean[] col = new boolean[n];

    // Step 1: Mark rows and columns
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            if (matrix[i][j] == 0) {
                row[i] = true;
                col[j] = true;
            }
        }
    }
    // Step 2: Set matrix[i][j] = 0 if row[i] or col[j] is marked
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            if (row[i] || col[j]) {
                matrix[i][j] = 0;
            }
        }
    }
    }
}