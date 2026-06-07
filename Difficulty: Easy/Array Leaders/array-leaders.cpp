

class Solution {
  public:
    vector<int> leaders(vector<int>& nums) {
        // code here
        vector<int> sol ;
        int n = nums.size();
        int maxi = -1;
        for(int i = n-1 ; i >=0; i--){
            if(nums[i] >= maxi){
                maxi = nums[i];
                sol.push_back(nums[i]);
            }
        }
        
        reverse(sol.begin() , sol.end());
        return sol;
    }
};