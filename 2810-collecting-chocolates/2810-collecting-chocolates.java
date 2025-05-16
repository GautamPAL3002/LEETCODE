class Solution {
    public long minCost(int[] nums, int x) {
         int n = nums.length;
        long result = Long.MAX_VALUE;

        int[] minCost = nums.clone(); // Track minimum cost for each type

        for (int k = 0; k < n; k++) {
            long total = (long) k * x; // Rotation cost

            for (int i = 0; i < n; i++) {
                int rotatedIndex = (i - k + n) % n;
                minCost[i] = Math.min(minCost[i], nums[rotatedIndex]);
                total += minCost[i];
            }

            result = Math.min(result, total);
        }

        return result;
        
    }
}