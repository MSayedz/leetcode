class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length-1, res = 0;
        for (int i = 0; i <mat.length; i++) {
            res += mat[i][i];
            if (i != n - i) 
                res += mat[i][n - i];
        }
        return res;
    }
}