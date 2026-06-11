class Solution {
public:
    int search(vector<int>& nums, int x) {
        int l = 0;
        int h = nums.size() -1;
        while(l<=h){
            int mid = l + (h-l)/2 ;
            if(nums[mid]==x) return mid;
            else if(nums[mid]>=nums[l]){
                if(x>=nums[l] && x<=nums[mid]){
                    h=mid-1;
                    continue;
                }else{
                    l=mid+1;
                    continue;
                }
            }else{
                if(x>nums[mid] && x <= nums[h]){
                    l=mid+1;
                }else{
                    h=mid-1;
                }
            }
        }
        return -1;
    }
};