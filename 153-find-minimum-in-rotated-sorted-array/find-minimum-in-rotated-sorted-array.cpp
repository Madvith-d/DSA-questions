class Solution {
public:
    int findMin(vector<int>& nums) {
        int l = 0;
        int h = nums.size() -1;
        int low = INT_MAX;
         while(l<=h){
            int mid = l + (h-l)/2;
            low = min(low , nums[mid]);
            if(nums[mid]<=nums[h]){
                h = mid-1;
            }else{
                l = mid+1;
            }
        }

        return low;
        
    }

   
};