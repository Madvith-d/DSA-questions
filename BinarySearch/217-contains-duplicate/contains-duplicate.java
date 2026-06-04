class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int n= nums.length;

        for(int i =0;i<n;i++){
            int item = nums[i];
            if(!set.add(item)){
                return true;

            }else{
                continue;
            }

        }
        return false;
    }
}