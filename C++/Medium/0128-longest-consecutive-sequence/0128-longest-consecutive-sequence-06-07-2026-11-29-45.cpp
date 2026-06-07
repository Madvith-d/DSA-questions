class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        unordered_set<int> st;
        int n = nums.size();
        int mLength = 0;
        for(int i = 0 ; i < n ; i ++){
            st.insert(nums[i]);
        }
        for(const auto& ele : st){
            if(st.find(ele -1) != st.end()){
                continue;
            }
            int j = 0;
            int cLength=0;
            while(true){
                if(st.find(ele+j)!=st.end()){
                    cLength++;
                    j++;
                }else{
                    break;
                }
            }
            mLength = max(mLength , cLength);
        }
        return mLength;
    }
};