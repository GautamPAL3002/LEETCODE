class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n;i++){//transpose of a matrix!!!!!
            for(int j=i;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        //reverse of a matrix!!
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){    //matrix[i][0]=matrix[i][2]and ,,,,, middle element[i][1]=matrix[i][1]
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-1-j];
                matrix[i][n-1-j]=temp;
            }
        }
    }
}