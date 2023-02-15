class Solution {
    public int climbStairs(int n) {
        if (n < 2) {
            return 1;
        }
        int first = 1;
        int second = 2;
        int cur;
        for (int i = 3; i <= n; i++) {
            cur = first + second;
            first = second;
            second = cur;
        }
        return second;
    }
}