class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int k = 0; k < nums.length - 2; k++) {
            if (k > 0 && nums[k - 1] == nums[k]) {

                continue;
            }
            int s = k + 1;
            int e = nums.length - 1;
            while (s < e) {

                int sum = nums[k] + nums[s] + nums[e];

                if (sum == 0) {
                    ArrayList<Integer> arr = new ArrayList<>();
                    arr.add(nums[k]);
                    arr.add(nums[s]);
                    arr.add(nums[e]);
                    res.add(arr);
                    s++;
                    e--;
                    while (s < e && nums[s] == nums[s - 1]) {
                        s++;
                    }

                    // Skip duplicate e
                    while (s < e && nums[e] == nums[e + 1]) {
                        e--;
                    }
                } else if (sum > 0) {
                    e--;
                } else {
                    s++;
                }
            }
        }

        return res;
    }
}