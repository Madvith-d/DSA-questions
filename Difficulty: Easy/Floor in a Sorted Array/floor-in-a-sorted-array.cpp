class Solution {
  public:
    int findFloor(vector<int>& nums, int x) {
        // code here
        int l = 0;
        int h = nums.size() -1;
        int ans = -1;
        while(l<=h){
            int mid = l + (h-l)/2;
            if(nums[mid]<=x){
                ans = mid;
                l=mid+1;
            }else{
                h = mid-1;
            }
        }
        return ans;
    }
};
