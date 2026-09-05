class Solution {
    public int[] twoSum(int[] nums, int target) {
        int s = 0;
        int e = nums.length -1 ;
        int res[] = new int[2];
        while(true){
            int sum = nums[s] + nums[e];
            if(sum == target){
                res[0]=s+1;
                res[1]=e+1;
                return res;
            }else if(sum > target){
                e--;
                
            }else{
                s++;
            }
        }
    }
}