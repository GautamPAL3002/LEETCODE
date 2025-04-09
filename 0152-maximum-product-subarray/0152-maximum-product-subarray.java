class Solution {
    public int maxProduct(int[] nums) {
        int currMax = nums[0];
        int currMin = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            if (num < 0) {
                int temp = currMax;
                currMax = currMin;
                currMin = temp;
            }
            currMax = (num > currMax * num) ? num : currMax * num;
            currMin = (num < currMin * num) ? num : currMin * num;
            if (currMax > result) {
                result = currMax;
            }
        }
        return result;
    }
}
