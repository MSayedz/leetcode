class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length * mat[0].length != c * r)
            return mat;
        int[][] res = new int[r][c];
        int x = 0, y=0;
        for(int i =0;i<mat.length;i++)
            for(int j=0;j<mat[0].length;j++){
                if(y == c){
                    y = 0;
                    x ++;
                }
                res[x][y++] = mat[i][j];
            }
        return res;
    }
}