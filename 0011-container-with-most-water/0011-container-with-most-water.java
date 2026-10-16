class Solution {
    public int maxArea(int[] height) {
        int s = 0 ;
        int e = height.length - 1; 


        int maxArea = 0 ;
        while(s<=e){
            int newArea = Math.min(height[s] , height[e]) * (e - s);
            maxArea  =  Math.max(maxArea , newArea );
            if(height[s] >= height[e]){
                e--;
            }else{
                s++;
            }
        }

        return maxArea ;
    }
}