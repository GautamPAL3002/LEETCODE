class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        permuteSet(res, nums, 0);
        return res;
    }

    private void permuteSet(List<List<Integer>> res, int[] nums, int ind){
        if(ind >= nums.length){
            List<Integer> tempList = new ArrayList<>();
            for(int num: nums) tempList.add(num);
            res.add(tempList);
            return;
        }
        for(int i = ind; i < nums.length; i++){
            swap(nums,ind,i);
            permuteSet(res,nums,ind+1);
            swap(nums,ind,i);
        }
    }   

    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

