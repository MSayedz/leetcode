class Solution {
//  DFS    
//     public int numIslands(char[][] grid) {
//         int islandsCount = 0;

//         for(int i = 0;i<grid.length; i++){
//             for(int j=0;j<grid[0].length; j++){
//                 if(grid[i][j] == '1'){
//                     islandsCount++;
//                     searchForNeighbors(grid, i, j);
//                 }
//             }
//         }
//         return islandsCount;
//     }
    
//     private void searchForNeighbors(char[][] grid, int r, int c){
//         if(r <0 || r >grid.length-1 
//            || c < 0 || c > grid[0].length-1 
//            || grid[r][c] != '1') 
//             return;
        
//             grid[r][c] = '0';
//             searchForNeighbors(grid, r+1, c);
//             searchForNeighbors(grid, r-1, c);
//             searchForNeighbors(grid, r, c+1);
//             searchForNeighbors(grid, r, c-1);
//     }
//     BFS
    class Cell {
        int row; int col;
        
        public Cell(int row, int col){
            this.row = row;
            this.col = col;
        }
        
        public int getRow(){return this.row;}
        public int getCol(){return this.col;}
    }
    
    int[] DIR = new int[]{0, 1, 0, -1, 0};
    
    public int numIslands(char[][] grid) {
        int islandsCount = 0;
        Cell curCell = null;
        ArrayDeque<Cell> queue = new ArrayDeque<>();
        for(int i = 0;i<grid.length; i++){
            for(int j=0;j<grid[0].length; j++){
                if(grid[i][j] == '1'){
                    islandsCount++;
                    queue.offer(new Cell(i,j));
                    while(!queue.isEmpty()){
                        curCell = queue.poll();
                        int row = curCell.getRow();
                        int col = curCell.getCol();
                        for(int k=0;k<4;k++){
                            int nr = row + DIR[k], nc = col + DIR[k+1];
                            if (nr <0 || nr == grid.length 
                                || nc < 0 || nc == grid[0].length 
                                || grid[nr][nc] != '1')
                                continue;
                                grid[nr][nc] = '0';
                                queue.offer(new Cell(nr,nc));
                        }
                        // if(row-1 >-1 && grid[row-1][col] == '1'){
                        //     grid[row-1][col] = '0';
                        //     queue.offer(new Cell(row-1,col));
                        // }
                        // if(col-1 >-1 && grid[row][col-1] == '1'){
                        //     grid[row][col-1] = '0';
                        //     queue.offer(new Cell(row,col-1));
                        // }
                        // if(row+1 <grid.length && grid[row+1][col] == '1'){
                        //     grid[row+1][col] = '0';
                        //     queue.offer(new Cell(row+1,col));
                        // }
                        // if(col+1 <grid[0].length && grid[row][col+1] == '1'){
                        //     grid[row][col+1] = '0';
                        //     queue.offer(new Cell(row,col+1));
                        // }
                            
                    }
                }
            }
        }
        
        return islandsCount;
    }
    
}