class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int res =-1;
        int cur = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<points.length;i++){
            if (points[i][0] == x || points[i][1] == y) {
                cur = Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]);
                if(min>cur){
                    min = cur;
                    res = i;
                }
            }
        }
        return res;
    }
}