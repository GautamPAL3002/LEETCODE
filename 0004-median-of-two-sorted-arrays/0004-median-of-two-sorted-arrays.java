class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] merged = new int[n1 + n2];

    
        int i = 0, j = 0, k = 0;

        
        while (i < n1 && j < n2) {
            if (nums1[i] < nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }

        
        while (i < n1) {
            merged[k++] = nums1[i++];
        }

        while (j < n2) {
            merged[k++] = nums2[j++];
        }

        
        int total = merged.length;
        if (total % 2 == 1) {
            
            return merged[total / 2];
        } else {
            
            int mid1 = merged[total / 2 - 1];
            int mid2 = merged[total / 2];
            return (mid1 + mid2) / 2.0;
        }
    }
}
