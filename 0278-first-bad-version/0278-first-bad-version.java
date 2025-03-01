/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 1, high = n;
        
        while (low < high) {  // Use < instead of <= to prevent infinite loop
            int mid = low + (high - low) / 2;  // Prevents integer overflow
            
            if (isBadVersion(mid)) {
                high = mid;  // Move left to find the first bad version
            } else {
                low = mid + 1;  // Move right
            }
        }
        
        return low;
    }
}