class Solution {
    public int numIslands(char[][] grid) {
        int numOfIslands = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == '1'){
                    numOfIslands++;
                    fillLand(grid, i, j);
                }
            }
        }
        
        return numOfIslands;
    }
    
    private void fillLand(char[][] grid, int i, int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j] != '1')
            return;
        
        grid[i][j] = '0';
        fillLand(grid, i-1, j);
        fillLand(grid, i+1, j);
        fillLand(grid, i, j-1);
        fillLand(grid, i, j+1);
        
    }
}