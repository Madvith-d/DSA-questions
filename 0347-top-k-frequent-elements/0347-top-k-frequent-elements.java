class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        ArrayList<Integer>[] bucket = new ArrayList[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            if (freq.containsKey(nums[i])) {
                freq.put(nums[i], freq.get(nums[i]) + 1);
            } else {
                freq.put(nums[i], 1);
            }
        }

        for (int key : freq.keySet()) {
            int val = freq.get(key);
            if (bucket[val] == null) {
                bucket[val] = new ArrayList<>();
            }

            bucket[val].add(key);
        }
        int m = 0;
        int[] res = new int[k];
        while (m != k) {
            for (int i = bucket.length - 1; i >= 0; i--) {
                if(bucket[i]==null){
                    continue;
                }else{
                    for(Integer l : bucket[i]){
                        res[m]=l;
                        m++;
                        if(m==k){
                            return res;
                        }

                    }
                }
            }
        }

        return res;

    }
}