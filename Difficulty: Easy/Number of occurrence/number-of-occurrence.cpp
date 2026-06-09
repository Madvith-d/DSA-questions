class Solution {
  public:
    int countFreq(vector<int>& arr, int target) {
        // code here
        int s =binarySearch(arr,target,true);
        int e =binarySearch(arr,target,false);
        if(s==-1 || e == -1){
            return 0;
        }else{
            return (e-s)+1;
        }
    }
    int binarySearch(vector<int> nums , int x , bool isFirst){
        int l =0;
        int h = nums.size() -1;
        int mid;
        int ans=-1;;
        while(l<=h){
             mid = l + (h-l)/2;
            if(nums[mid]>x){
                h=mid-1;
            }else if(nums[mid]<x){
                l = mid+1;
            }else{
                if(isFirst){
                    h=mid-1;
                    ans=mid;
                }else{
                    l=mid+1;
                    ans=mid;
                }
            }
        }
        return ans ;
        
    }
};
