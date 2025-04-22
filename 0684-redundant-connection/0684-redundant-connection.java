class Solution {
 public int[] findRedundantConnection(int[][] edges) {
        int n=edges.length;
        parent=new int[n+1];
        for(int i=0;i<n;i++)
            parent[i]=i;
            for(int[]edge:edges){
                if(!union(edge[0],edge[1]))
                return edge;
            }
        
        return new int[0];
    }
    public  boolean union(int x,int y){
        int rootx=find(x);
        int rooty=find(y);
        if(rootx==rooty)
        return false;//cycle detect
        parent[rootx]=rooty;
        return true;//merge 
    }
    int[] parent;
    public int find(int x){
        if(parent[x]!=x)
        parent[x]=find(parent[x]);
        return parent[x];
    }
    }


