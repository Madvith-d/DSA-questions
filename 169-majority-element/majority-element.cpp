class Solution {
public:
    int majorityElement(vector<int>& nums) {
        unordered_map<int,int> mp;
        int n= nums.size() ;
        for(int i = 0 ; i < n ;i++){
            mp[nums[i]]+=1;
        }
        for(const auto& [num , count] : mp){
            if(count  > (n/2)){
                return num;
            }
        }
        return -1;
    }
};