class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int[] stonesCount = new int[256];
        
        for(char cur: stones.toCharArray()){
            stonesCount[cur]++;
        }
        
        int res = 0;
        for(char cur: jewels.toCharArray()){
            res +=stonesCount[cur];
        }
        
        return res;
    }
}