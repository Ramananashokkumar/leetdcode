class Solution {
    public void rotate(int[][] matrix) {
    int r=matrix.length;
     int c=matrix[0].length;
     int t[][]=new int[r][c];
     for(int i=0;i<r;i++){
         for(int j=i;j<c;j++){
             t[i][j]=matrix[i][j];
             matrix[i][j]=matrix[j][i];
             matrix[j][i]=t[i][j];
         }
     }
   for(int i=0;i<r;i++){
         for(int j=0;j<c/2;j++){
             t[i][j]=matrix[i][j];
             matrix[i][j]=matrix[i][c-1-j];
              matrix[i][c-1-j]=t[i][j];
         }
     }
    }
}
