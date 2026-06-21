class Solution {
public:
    int singleNonDuplicate(vector<int>& nums) {
        int l = 0 ; 
        int h = nums.size() -1 ;
        int mid;
        while(l <= h){
            mid = l + (h-l)/2;
            if(isEven(mid)){
                if (mid<nums.size()-1 &&  nums[mid+1]==nums[mid]){
                    l = mid +1;
                    continue;
                }else{
                    h = mid -1 ;
                }
            }else{
                if(mid !=0 && nums[mid-1] == nums[mid] ){
                    l = mid +1 ;
                }else{
                    h = mid -1 ;
                }
            }
        }
        return nums[l];
    }

    bool isEven(int num){
        if(num % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
};