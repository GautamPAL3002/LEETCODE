class Solution {
    public int findMin(int[] arr) {
        if (arr.length == 0) return -1;
        int st = 0;
        int end = arr.length - 1;

        while (st < end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] < arr[end]) {
                end = mid; 
            } else if (arr[mid] > arr[end]) {
                st = mid + 1; 
            } else {
                
                end--;
            }
        }

        return arr[st];
    }
}


            
        

        
        
   