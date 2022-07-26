class Solution {
    public boolean isPerfectSquare(int num) {
        long n = num;
        while(n*n > num){
            n = (n + num/n) /2;
        }
        return n*n == num;
    }
}