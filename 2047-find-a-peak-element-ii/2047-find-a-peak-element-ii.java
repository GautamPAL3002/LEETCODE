public class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int rowCount = mat.length;
        int colCount = mat[0].length;

        int left = 0;
        int right = colCount - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int maxRow = 0;
            for (int i = 0; i < rowCount; i++) {
                if (mat[i][mid] > mat[maxRow][mid]) {
                    maxRow = i;
                } } int curr = mat[maxRow][mid];
                   int leftVal = (mid > 0) ? mat[maxRow][mid - 1] : -1;
                   int rightVal = (mid < colCount - 1) ? mat[maxRow][mid + 1] : -1;
            if (curr > leftVal && curr > rightVal) {
                return new int[]{maxRow, mid};
            }
            if (rightVal > curr) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }return new int[]{-1, -1}; 
    }
}
