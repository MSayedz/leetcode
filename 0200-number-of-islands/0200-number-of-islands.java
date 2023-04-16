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
    
//     BFS
//     class Cell {
//         int row; int col;
        
//         public Cell(int row, int col){
//             this.row = row;
//             this.col = col;
//         }
        
//         public int getRow(){return this.row;}
//         public int getCol(){return this.col;}
//     }
    
//     int[] DIR = new int[]{0, 1, 0, -1, 0};
    
//     public int numIslands(char[][] grid) {
//         int islandsCount = 0;
//         Cell curCell = null;
//         ArrayDeque<Cell> queue = new ArrayDeque<>();
//         for(int i = 0;i<grid.length; i++){
//             for(int j=0;j<grid[0].length; j++){
//                 if(grid[i][j] == '1'){
//                     islandsCount++;
//                     queue.offer(new Cell(i,j));
//                     while(!queue.isEmpty()){
//                         curCell = queue.poll();
//                         int row = curCell.getRow();
//                         int col = curCell.getCol();
//                         for(int k=0;k<4;k++){
//                             int nr = row + DIR[k], nc = col + DIR[k+1];
//                             if (nr <0 || nr == grid.length 
//                                 || nc < 0 || nc == grid[0].length 
//                                 || grid[nr][nc] != '1')
//                                 continue;
//                                 grid[nr][nc] = '0';
//                                 queue.offer(new Cell(nr,nc));
//                         }
                            
//                     }
//                 }
//             }
//         }
        
//         return islandsCount;
//     }
}
