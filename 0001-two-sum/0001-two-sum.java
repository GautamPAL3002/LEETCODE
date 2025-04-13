class Solution {
    public int[] twoSum(int[] nums, int target) {
        // HashMap to store number and its index
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // If complement is found, return indices
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            
            // Otherwise, add current number and its index to map
            map.put(nums[i], i);
        }
        
        // If no solution is found (LeetCode guarantees one exists)
        return new int[] {};
    }
}
