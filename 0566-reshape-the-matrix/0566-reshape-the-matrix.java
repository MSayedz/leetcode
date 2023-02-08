class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {        
        if(mat.length*mat[0].length!=r*c)
            return mat;
        int[][] res = new int[r][c];
        int x =0, y=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(y == c){
                    y = 0;
                    x++;
                }
                res[x][y++] = mat[i][j];
            }
        }
        return res;
        
//         int[][] res = new int[r][c];
//         if (nums.length == 0 || r * c != nums.length * nums[0].length)
//             return nums;
        
//         Queue<Integer> queue = new LinkedList();
//         for (int i = 0; i < nums.length; i++) 
//             for (int j = 0; j < nums[0].length; j++) 
//                 queue.add(nums[i][j]);
                
//         for (int i = 0; i < r; i++) 
//             for (int j = 0; j < c; j++) 
//                 res[i][j] = queue.remove();
        
//         return res;
    }
}