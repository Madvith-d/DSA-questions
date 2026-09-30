class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer , Integer > hm = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i ++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i] , hm.get(nums[i])+1);
            }else{
                hm.put(nums[i] , 1);
            }
        }

        int k = 0;
        int i = 0;

        while(i < nums.length){
            if(!hm.containsKey(k)){
                k++;
                continue;
            }
            int val = hm.get(k);
            if(val > 0){
                nums[i] = k;
                hm.put( k ,  hm.get(k) - 1);
                i++;
                continue;
            }else{
                k++;
            }
        }

   
    }
}