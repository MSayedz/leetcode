class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int res =-1;
        int cur = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<points.length;i++){
            cur = Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]);
            if(min>cur && (x == points[i][0] || y == points[i][1])){
                min = cur;
                res = i;
            }
        }
        return res;
    }
}