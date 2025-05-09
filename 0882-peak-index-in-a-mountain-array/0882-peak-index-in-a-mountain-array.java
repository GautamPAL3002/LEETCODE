class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<end){
            // add.trick to handle dublicant edge case;
            //dublicant on left side
            while(start<end&&arr[start]==arr[start+1])
            start++;
            while(start<end&&arr[end]==arr[end-1])
            end--;
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
            end=mid;}
            else{
            start=mid+1;}
        
        }return start;
        
    }
}