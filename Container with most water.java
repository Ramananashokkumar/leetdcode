class Solution {
  public int maxArea(int[] height) {
    int c=0;
    int m=0;
    int i=0;
    int w=0;
    int h=height.length-1;
    while(i<=h){
           w=h-i;
            m=Math.min(height[i],height[h]);
            c=Math.max(c,w*m);
             if(height[i]<height[h]){i++;
        }else{h--;}
    }return c;
    }
}
