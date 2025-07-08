class Solution {
    public int totalFruit(int[] fruits) {

        Map<Integer, Integer> map= new HashMap<>();
        int n=fruits.length;
        int res=0;
        int start=0;

        for(int i=0;i<n;i++){
            int f=fruits[i];
            map.put(f, map.getOrDefault(f,0)+1);

            while(map.size()>2){
                int l=fruits[start];
                map.put(l, map.get(l)-1);

                if(map.get(l)==0){
                    map.remove(l);
                }
                start++;
            }
            res=Math.max(res, i-start+1);
        }
        return res;
        
    }
}