class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix[0].length == 0)
            return false;
        int targetedRow = 0;
        for(;targetedRow<matrix.length;)
            if(matrix[targetedRow++][matrix[0].length-1] >= target)
                break;
        targetedRow--;
        
        int targetedCol = 0;
        if(matrix[targetedRow].length == 0)
            return matrix[targetedRow][0] == target;
        else if(matrix[0].length > 0)
            targetedCol 
                = Arrays.binarySearch(matrix[targetedRow], target);
        
        return targetedCol >= 0 
            && matrix[targetedRow][targetedCol] == target;
    }
}