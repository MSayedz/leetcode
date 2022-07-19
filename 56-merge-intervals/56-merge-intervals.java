class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0]-b[0]);
        
        LinkedList<int[]> merged = new LinkedList<>();
        int s = intervals[0][0];
        int e = intervals[0][1];
        for (int i = 1; i<intervals.length;i++) {
            if ( e < intervals[i][0]) {
                merged.add(new int[]{s,e});
                s = intervals[i][0];
                e = intervals[i][1];
            } else if (e < intervals[i][1]){
                e = intervals[i][1];
            }
        }
        merged.add(new int[]{s,e});
        return merged.toArray(new int[merged.size()][]);
    }
}