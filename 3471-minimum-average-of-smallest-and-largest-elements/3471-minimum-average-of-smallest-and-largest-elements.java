class Solution {
    public double minimumAverage(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
         double minavg = Double.MAX_VALUE;
         for(int i=0;i<n/2;i++){
            double avg=(nums[i]+nums[n-1-i])/2.0;
            minavg=Math.min(minavg,avg);
         }
         return minavg;

        
    }
}