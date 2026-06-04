class Solution {
public:
    void sortColors(vector<int>& nums) {
        map<int,int> mp;
        for(int i = 0 ; i < nums.size() ; i++){
            mp[nums[i]]+=1;
        }
        int p = 0;
        int i = 0;
        for( const auto& [value , count] : mp) {
            p+=count;
            while(i<p){
                nums[i] = value;
                i++;
            }
        }
    }
};