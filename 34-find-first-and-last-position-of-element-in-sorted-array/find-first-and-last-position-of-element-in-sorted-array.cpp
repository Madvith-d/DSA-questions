class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int x) {
        int l = 0;
        int h = nums.size() - 1;
        int mid;
        int f = -1, s = -1;
        while (l <= h) {
            mid = l + (h - l) / 2;
            if (nums[mid] == x) {
                h = mid - 1;
                f = mid;
            } else if (nums[mid] > x) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        l = 0;
        h = nums.size() - 1;
        while (l <= h) {
            mid = l + (h - l) / 2;
            if (nums[mid] == x) {
                l = mid + 1;
                s = mid;
            } else if (nums[mid] < x) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }

        return {f, s};
    }
};