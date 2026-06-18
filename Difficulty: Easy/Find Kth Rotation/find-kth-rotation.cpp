class Solution {
  public:
    int findKRotation(vector<int> &nums) {
        // Code Here
        int l = 0;
        int h = nums.size() -1 ;
        int mid;
        int k;
        int prev = INT_MAX;
        while(l<=h){
            mid = l + (h-l)/2;
            if(nums[mid]<prev){
                prev = nums[mid];
                k = mid;
            }
           
            if(nums[mid]<=nums[h]){
                h = mid -1;
            }else{
                l = mid +1;
            }
        }
        
        return k ;
        
    }
};
