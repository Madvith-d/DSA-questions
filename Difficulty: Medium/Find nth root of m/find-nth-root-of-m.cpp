class Solution {
  public:
    int nthRoot(int n, int m) {
        // Code here
        int l = 0;
        int h = m;
        while(l <= h){
            int mid = l + (h-l)/2;
            int res = pow(mid , n);
            if(res==m){
                return mid;
            }
            if(res>m){
                h = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return -1;
    }
};