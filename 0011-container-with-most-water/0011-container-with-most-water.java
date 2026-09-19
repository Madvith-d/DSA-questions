class Solution {
    public int maxArea(int[] nums) {
        int  left  = 0 ;
        int right  = nums.length - 1;
        int area = 0;
        while(left  < right){
            area  = Math.max(area , Math.min(nums[left],nums[right]) * (right - left));
            if(nums[left]>nums[right]){
                right--;
            }else{
                left++;
            }
        }
        return area;
    }
}