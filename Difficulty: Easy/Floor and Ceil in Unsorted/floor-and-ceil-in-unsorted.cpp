class Solution {
  public:
    vector<int> getFloorAndCeil(int x, vector<int> &nums) {
        // code here
        int flr =-1, cl =-1;
        sort(nums.begin() , nums.end());
        int l = 0 ;
        int h = nums.size() -1;
        while(l<=h){
            int mid = l + (h-l)/2;
            if(nums[mid]==x){
                return {x , x};
                
            }else if(nums[mid]>x){
                h = mid -1;
            }else{
                l = mid+1;
            }
            
        }
        if( !(l==nums.size() || l < 0) ) cl =nums[l];
        if( !(h==nums.size() || h < 0) ) flr =nums[h];
        return {flr , cl};
    }
};