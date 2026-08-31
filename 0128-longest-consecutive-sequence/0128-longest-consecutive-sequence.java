class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

        int maxi = 0 ;
        for(int num : set){
            if(set.contains(num-1)){
                continue;
            }
            int i = 1;
            int count = 1;
            while(set.contains(num+i)){
                count++;
                i++;
            }
            maxi =Math.max(maxi , count);
        }
        return maxi;
    }
}