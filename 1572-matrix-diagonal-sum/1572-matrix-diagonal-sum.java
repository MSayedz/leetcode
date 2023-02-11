class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length, res = 0;
        for (int i = 0; i < n; i++) {
            res += mat[i][i];
            if (i != n - i - 1) 
                res += mat[i][n - i - 1];
        }
        return res;
    }
}