class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] pre = new int[n];
        int[] suf = new int[n];
        for(int i = 0 ; i < n ; i++){
            if(i==0){
                pre[i] = nums[i];
            }else{
                pre[i]=nums[i]*pre[i-1];
            }
        }

        for(int i = n-1 ; i>=0;i--){
            if(i==n-1){
                suf[i]=nums[i];
            }else{
                suf[i] = nums[i]*suf[i+1];
            }
        }

        nums[0] = suf[1];
        nums[n-1]=pre[n-2];
        for(int i = 1;i<n-1;i++){
            nums[i] = pre[i-1]*suf[i+1];
        }
        return nums;

    }
}