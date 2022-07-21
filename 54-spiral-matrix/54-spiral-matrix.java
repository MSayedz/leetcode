class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> result = new ArrayList<Integer>();
        if (matrix == null || matrix.length == 0) return result;
        if (matrix[0].length-1 == 0){
            for(int i = 0; i < matrix.length; i ++){
            
            result.add(matrix[i][0]);
            }
            return result;
        }
        
        
        int i, k = 0, l = 0;
        int r = matrix.length;
        int c = matrix[0].length;
        while(k < r && l < c) {
            for(i = l; i < c;i++) {
                result.add(matrix[k][i]);
            }
            k++;
            for(i = k; i < r; i++) {
                result.add(matrix[i][c - 1]);
            }
            c--;
            if(k < r) {
                for(i = c - 1; i >= l; i--) {
                    result.add(matrix[r-1][i]);
                }
                r--;
            }
            if(l < c) {
                for(i = r - 1; i >= k;i--) {
                    result.add(matrix[i][l]);
                }
                l++;
            }
        }
        
        // int n = 0; int m = 0; 
//         int nMax = matrix.length == 0 ? 0 : matrix.length-1;
//         int mMax = matrix[0].length == 0 ? 0 : matrix[0].length-1;
//         int nMin = 1;
//         int mMin = 0;
        
//         boolean moveLeft = false;
//         boolean moveRight = true;
//         boolean moveDown = false;
//         boolean moveUp = false;
        
        
//         for(int i = 0; i < matrix.length * matrix[0].length; i ++){
            
//             result.add(matrix[n][m]);
            
//             if(moveRight){
//                 m ++;
//                 if(m >= mMax){
//                     mMax--;
//                     moveRight = false;
//                     moveDown = true;
//                 }
                
//             } else if(moveDown){
//                 n ++;
//                 if(n >= nMax){
//                     nMax--;
//                     moveLeft = true;
//                     moveDown = false;
//                 }
                
//             } else if(moveLeft){
//                 m--;
//                 if(m <= mMin){
//                     mMin ++;
//                     moveLeft = false;
//                     moveUp = true;
//                 }
//             } else if(moveUp){
//                 n--;
//                 if(n <= nMin){
//                     nMin++;
//                     moveRight = true;
//                     moveUp = false;
//                 }
//             }
//         }
        return result;
    }
}