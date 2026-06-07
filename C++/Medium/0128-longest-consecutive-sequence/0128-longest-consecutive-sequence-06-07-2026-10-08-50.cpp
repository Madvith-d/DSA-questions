class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        sort(nums.begin() , nums.end());
        int n = nums.size();
        if(n==0){
            return 0;
        }
        int cLength =0, mLength = 0;
        for(int i= 0; i < nums.size() -1 ;i ++ ){
            if(nums[i+1] - nums[i] == 1){
                cLength++;
                mLength = max(mLength , cLength);
            }else if(nums[i+1] - nums[i] == 0){
                continue;
            }else{
                cLength =0;
                mLength = max(mLength , cLength);
            }
        }

        return mLength+1;
    }
};