class Solution {
public:
    int maximumDifference(vector<int>& nums) {
        int maxi = -1;
        int n = nums.size();
        if(n<2){
            return maxi;
        }
        int l = 0;
        int r  = 1;
        while(r<n){
            if(nums[r]<=nums[l]){
                l = r;
                r++;
                continue;
            }else{
                maxi = max(maxi , nums[r]-nums[l]);
                r++;
            }
        }
        return maxi;
    }
};