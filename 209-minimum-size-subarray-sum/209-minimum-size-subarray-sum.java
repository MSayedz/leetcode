class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int i = 0, n = nums.length, res = n + 1;
        for (int j = 0; j < n; ++j) {
            s -= nums[j];
            while (s <= 0) {
                res = Math.min(res, j - i + 1);
                s += nums[i++];
            }
        }
        return res % (n + 1);
    }
}