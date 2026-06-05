class Solution {
public:
    vector<int> twoSum(vector<int>& numbers, int target) {
        unordered_map<int,int> mp ;
        vector<int> v = {-1 , -1 };
        int n = numbers.size();
        int i = 0;
        while(i <numbers.size()){
            int cmp = target - numbers[i];
            if (mp.find(cmp) != mp.end() ) {
                return {mp[cmp] +1 , i+1 };

            }else{
                mp[numbers[i]]=i;
                i++;
            }
        }
        return v;
    }
};