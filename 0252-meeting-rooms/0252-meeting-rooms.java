class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, (a,b)-> a[0] - b[0]);
        
        for(int i=0;i<intervals.length;i++){
            if(i != 0 && intervals[i][0] < intervals[i-1][1])
                return false;
        }
        
        return true;
    }
}