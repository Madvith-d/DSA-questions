class Solution {
    public boolean check(int[] nums) {
        int min = 0;
        for(int i = 0 ; i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                min = i+1;
            }
        }
        int count = 0;
        int k = 0;
        int cur = 0;
        int nex = 0;
        while(count<nums.length-1){
            cur = (min+k)%nums.length;
            nex = (min+k+1)%nums.length;
            if(nums[nex]>=nums[cur]){
                count++;
                k++;
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
}