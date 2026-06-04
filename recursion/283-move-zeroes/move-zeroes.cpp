class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int top = 0;
        if (nums.size() <= 1) {
            return;
        }
        for (int cur = 0; cur < nums.size(); cur++) {
            if (nums[cur] != 0) {
                nums[top] = nums[cur];
                top++;
            } 
        }

        while (top < nums.size()) {
            nums[top] = 0;
            top++;
        }
        return;
    }
};