class Solution {
public:
    bool check(vector<int>& nums) {
        int count = 0;
        int size = nums.size();
        
        for(int i = 0 ; i < size ; i ++){
            if(count >1)
                break;
            if(nums[i] > nums[(i+1)%size ] ){
                count++;
            }else{
                continue;
            }
        }
        if(count<=1){
            return true;
        }else{
            return false;
        }
    }
};