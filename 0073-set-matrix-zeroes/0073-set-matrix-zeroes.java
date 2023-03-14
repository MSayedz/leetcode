class Solution {
    public void setZeroes(int[][] matrix) {
        
        boolean[] rows = new boolean[matrix.length];
        boolean[] cols = new boolean[matrix[0].length];
        
        for(int i= 0; i < matrix.length; i++)
            for(int j= 0; j < matrix[0].length; j++)
                if(matrix[i][j] == 0){
                    rows[i] = true;
                    cols[j] = true;
                }
        
        for(int i= 0;i< matrix.length; i++)
            for(int j= 0; j < matrix[0].length; j++)
                if(rows[i] == true || cols[j] == true)
                    matrix[i][j] = 0;
        
//         int[][] matrixCopy = new int[matrix.length][matrix[0].length];
        
//         for(int i=0;i<matrix.length;i++)
//             for(int j=0;j<matrix[0].length;j++)
//                 if(matrix[i][j]==0)
//                     dfs(matrixCopy, i, j);
        
//         for(int i=0;i<matrix.length;i++)
//             for(int j=0;j<matrix[0].length;j++)
//                 if(matrixCopy[i][j] == -1)
//                     matrix[i][j] = 0;
        
    }
    
    // private void dfs(int[][] matrixCopy, int i, int j){
    //     for(int k=0;k<matrixCopy.length;k++)
    //         matrixCopy[k][j] = -1;
    //     for(int k=0;k<matrixCopy[0].length;k++)
    //         matrixCopy[i][k] = -1;
    // }
}