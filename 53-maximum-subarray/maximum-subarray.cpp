class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int res = INT_MIN;
        int sum = 0;
        int n = nums.size();
        for(int i = 0 ; i< n ; i++){
            sum+=nums[i];
            res = max(res , sum);
            if(sum < 0) sum = 0;

        }
        return res;
    }
};