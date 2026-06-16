class Solution {
public:
    bool search(vector<int>& nums, int x) {
        int l = 0; 
        int h = nums.size() -1;
        return binSearch(nums,l,h,x);
    }
    bool binSearch(vector<int>& nums , int l , int h , int x){
        if(l>h){
            return false;
        }
        int mid = l + (h-l)/2;
        if(nums[mid]==x){
            return true;
        }else{
          if(  binSearch(nums,l,mid-1,x) ||
            binSearch(nums,mid+1,h,x) ) {
                return true;
            }
        }
        return false;
        
    }
};