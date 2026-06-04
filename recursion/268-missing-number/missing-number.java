class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i<nums.length;i++){
            hs.add(nums[i]);
        }
        int j;
        for(j = 0; j<=nums.length;j++){
            if(!hs.contains(j)){
                break;
            }
        }
        return j;
    }
}