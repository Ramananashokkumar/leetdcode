class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
    ArrayList<Integer>ans=new ArrayList<Integer>();
     int r=matrix.length;
     int c=matrix[0].length;
     int fr=0,lr=r-1,fc=0,lc=c-1;
     while(ans.size()<r*c){
     for(int i =fc;i<=lc;i++){
         ans.add(matrix[fr][i]);
     }
    for(int i =fr+1;i<=lr;i++){
        ans.add(matrix[i][lc]);
    }
    if(fr!=lr){
        for(int i=lc-1;i>=fc;i--){
            ans.add(matrix[lr][i]);
        }
    }if(fc!=lc){
        for(int i=lr-1;i>=fr+1;i--){
            ans.add(matrix[i][fc]);
        }
    }
    fc++;
    lc--;
    fr++;
    lr--;
      
}return ans;
    }
}
