class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> v = { -1 , -1 };
        unordered_map<int,int> mp ;
        int n = nums.size();
        for(int i = 0 ; i < n; i++){
            int cmp = target-nums[i] ;
            if(mp.find(cmp)  != mp.end() ){
                v= {i , mp[cmp]};
                return v;
            }else{
                mp[nums[i]] = i;
            }
        }
        return v;
    }
};