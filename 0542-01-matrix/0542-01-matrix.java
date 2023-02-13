class Solution {
    int[] DIR = new int[]{0, 1, 0, -1, 0};
    public int[][] updateMatrix(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        Queue<int[]> q = new ArrayDeque<>();
        for (int r = 0; r < m; ++r)
            for (int c = 0; c < n; ++c)
                if (matrix[r][c] == 0) 
                    q.offer(new int[]{r, c});
                else 
                    matrix[r][c] = -1;

        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int r = curr[0], c = curr[1];
            for (int i = 0; i < 4; ++i) {
                int nr = r + DIR[i], nc = c + DIR[i+1];
                if (nr < 0 || nr == m 
                    || nc < 0 || nc == n 
                    || matrix[nr][nc] != -1) 
                    continue;
                matrix[nr][nc] = matrix[r][c] + 1;
                q.offer(new int[]{nr, nc});
            }
        }
        return matrix;
    }
}