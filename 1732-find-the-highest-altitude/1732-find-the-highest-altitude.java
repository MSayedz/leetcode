class Solution {
    public int largestAltitude(int[] gain) {
        int res = 0;
        int cur = 0;
        for(int i=0;i<gain.length;i++){
            cur+=gain[i];
            res = res>cur?res:cur;
        }
        
        return res;
    }
}