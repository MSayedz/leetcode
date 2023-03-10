class Solution {
    public int minMeetingRooms(int[][] intervals) {
        
        int[] starts = new int[intervals.length];
        int[] ends = new int[intervals.length];
        for(int i=0; i<intervals.length; i++) {
            starts[i] = intervals[i][0];
            ends[i] = intervals[i][1];
        }
        
        Arrays.sort(starts);
        Arrays.sort(ends);
        
        int i = 0;
        int rooms = 0;
        int endsItr = 0;
        
        while (i < starts.length) {
            if(starts[i++] < ends[endsItr]) {
                rooms++;
            } else {
                endsItr++;
            }
        }
        return rooms;
        // if(intervals.length <1)
        //     return 0;
        // Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        // PriorityQueue<int[]> queue 
        //     = new PriorityQueue<>((a,b) -> a[1] -b[1]);
        // int i = 0;
        // while(i<intervals.length){
        //     if(!queue.isEmpty() && queue.peek()[1] <= intervals[i][0]){
        //         queue.poll();
        //     }
        //     queue.add(intervals[i++]);
        // }
        // return queue.size();   
    }
}