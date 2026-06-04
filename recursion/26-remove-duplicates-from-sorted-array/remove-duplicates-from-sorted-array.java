class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
      int top = 0;

      for(int i = 1; i< nums.length ; i++){
        if(nums[top]!=nums[i]){
            int temp = nums[i];
            top++;
            nums[top]=nums[i];

        }else{
            continue;
        }
      }
      return top+1;  
    }
}