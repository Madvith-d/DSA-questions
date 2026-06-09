class Solution {
public:
    int searchInsert(vector<int>& nums, int x) {
        int l = 0;
        int h = nums.size() -1;
        int mid;
        while(l<=h){
            mid = l + (h-l)/2;
            if(nums[mid]==x){
                return mid;
            }else if(nums[mid]>x){
                h=mid-1;

            }else{
                l=mid+1;
            }
        }
        return l;
    }
};