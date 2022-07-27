class Solution {
    public int equalPairs(int[][] grid) {
        int res =0;
        Map<String, Integer> seen = new HashMap<String, Integer>();
        
        for (int[] row : grid)
            seen.merge(Arrays.toString(row), 1, Integer::sum);
        
        for (int c = 0, n = grid.length; c < n; c++) {
            int[] col = new int[n];
            for (int r = 0; r < n; r++) 
                col[r] = grid[r][c];
            
            res += seen.getOrDefault(Arrays.toString(col), 0);
        }
        return res;
    }
}