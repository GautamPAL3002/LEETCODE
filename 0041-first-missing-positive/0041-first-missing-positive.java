class Solution {
    public int firstMissingPositive(int[] nums) {
         Set<Integer> set = new HashSet<>();
        
        for(int num:nums)
       {
         if(num>0)
        set.add(num);
        }
        for(int i=1;i<=nums.length;i++)
        {
            if(!set.contains(i))
            return i;
        }

        return nums.length+1;
    }
}


//this queston im solving with the hashset in which:
//step1.arrange all the element in their right place 
//step2.traverse by using for loop from i=1 if the element is not contain (!set.contain(i)) return i!!!!!!