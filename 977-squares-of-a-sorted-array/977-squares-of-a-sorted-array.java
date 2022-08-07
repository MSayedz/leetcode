class Solution {
    public int[] sortedSquares(int[] A) {
        int n = A.length;
        int i = 0, j = n - 1;
        
        int[] res = new int[n];
        for (int k = n - 1; k >= 0; k--) {
            if (Math.abs(A[i]) > Math.abs(A[j])) {
                res[k] = A[i] * A[i];
                i++;
            } else {
                res[k] = A[j] * A[j];
                j--;
            }
        }
        return res;
    }
}