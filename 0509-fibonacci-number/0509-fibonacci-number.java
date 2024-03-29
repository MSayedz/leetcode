class Solution {
    public int fib(int N) {
        if(N == 0)
            return 0;
        if(N <= 2)
            return 1;
        int current = 0;
        int prev1 = 1;
        int prev2 = 1;

        for (int i = 3; i <= N; i++) {
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        return current;
    }
}