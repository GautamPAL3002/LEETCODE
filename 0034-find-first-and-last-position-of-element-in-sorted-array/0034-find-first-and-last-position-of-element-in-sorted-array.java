class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findFirstOccurrence(nums, target);
        int last = findLastOccurrence(nums, target);
        return new int[]{first, last};
    }

    private int findFirstOccurrence(int[] nums, int target) {
        int index = -1;
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
            if (nums[mid] == target) {
                index = mid; 
            }
        }
        return index;
    }

    private int findLastOccurrence(int[] nums, int target) {
        int index = -1;
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
            if (nums[mid] == target) {
                index = mid; 
            }
        }
        return index;
    }
}
