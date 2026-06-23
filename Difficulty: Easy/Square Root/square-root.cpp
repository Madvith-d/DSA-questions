class Solution {
  public:
    int floorSqrt(int n) {
        // code here
        int l = 0;
        int h = n;
        while(l<=h){
            int mid = l + (h-l)/2;
            if(mid * mid ==n){
                return mid ;
            }
            if(mid*mid > n){
                h=mid-1;
            }else{
                l = mid +1 ;
            }
        }
        
        return h;
    }
    
};