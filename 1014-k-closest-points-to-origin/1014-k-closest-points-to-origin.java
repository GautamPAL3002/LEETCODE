class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]>max=new PriorityQueue<>((a,b)->distance(b)-distance(a));
        for(int[]point:points){
            max.offer(point);
            if(max.size()>k)
            max.poll();}
            int[][]result=new int[k][2];
            for(int i=0;i<k;i++)
            result[i]=max.poll();
            return result;}
        
    private int distance(int[] point){
        return point[0]*point[0]+point[1]*point[1];

    }
    
}