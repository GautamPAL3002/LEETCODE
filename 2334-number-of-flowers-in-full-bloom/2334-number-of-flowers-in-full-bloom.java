import java.util.*;

public class Solution {
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        int n = flowers.length;
        int m = people.length;

        int[] start = new int[n];
        int[] end = new int[n];

        for (int i = 0; i < n; i++) {
            start[i] = flowers[i][0];
            end[i] = flowers[i][1];
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int[] result = new int[m];
        for (int i = 0; i < m; i++) {
            int day = people[i];

            int started = upperBound(start, day); // flowers that started ≤ day
            int ended = lowerBound(end, day);     // flowers that ended < day

            result[i] = started - ended;
        }

        return result;
    }

    // upperBound: returns index of first element > target (like bisect_right in Python)
    private int upperBound(int[] arr, int target) {
        int low = 0, high = arr.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] <= target)
                low = mid + 1;
            else
                high = mid;
        }
        return low;
    }

    // lowerBound: returns index of first element ≥ target (like bisect_left)
    private int lowerBound(int[] arr, int target) {
        int low = 0, high = arr.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid;
        }
        return low;
    }
}
