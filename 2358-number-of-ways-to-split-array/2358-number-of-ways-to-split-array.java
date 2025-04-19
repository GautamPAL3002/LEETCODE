class Solution {
    public int waysToSplitArray(int[] nums) {
        int count=0;
        long sum=0;
        long left=0,right=0;
        for(int num:nums)
        sum+=num;
        for( int i=0;i<nums.length-1;i++){
            left+=nums[i];
            right=sum-left;
            if(left>=right)
            count++;}
        return  count;
    }
}