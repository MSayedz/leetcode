class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length;
        int n=mat[0].length;
        if(m*n!=r*c)
            return mat;
        int[][] a=new int[r][c];
        int a_rows=0;
        int a_cols=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[a_rows][a_cols]=mat[i][j];
                a_cols++;
                if(a_cols==c){
                    a_cols=0;
                    a_rows++;
                }
            }
        }
        return a;
    }
}