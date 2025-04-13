class Solution {
    public void sortColors(int[] nums) {
        int[] count = new int[3]; // Count for 0,1and 2
        for (int num : nums) {
            count[num]++;
        }
        int index = 0;
        for (int i = 0; i < 3; i++) {
            while (count[i]-- > 0) {
                nums[index++] = i;
            }
        }
    }
}

