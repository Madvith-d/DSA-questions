class Solution {
    public void moveZeroes(int[] nums) {
        int s = 0;
        int e = nums.length -1;
        while(s<=e){
            if(nums[s]==0){
                for(int i = s ; i < e ; i++){
                    int temp = nums[i+1];
                    nums[i+1]=nums[i];
                    nums[i]=temp;
                }
                e--;
            }else{
                s++;
            }

        }
    }
}