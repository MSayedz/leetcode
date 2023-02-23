class Solution {
    public int numJewelsInStones(String jewels, String stones) {
//         int[] stonesCount = new int[256];
        
//         for(char cur: stones.toCharArray())
//             stonesCount[cur]++;
        
//         int res = 0;
//         for(char cur: jewels.toCharArray())
//             res +=stonesCount[cur];
        
//         return res;
        
        int res = 0;
        Set setJ = new HashSet();
        for (char j: jewels.toCharArray())
            setJ.add(j);
        for (char s: stones.toCharArray())
            if (setJ.contains(s)) 
                res++;
        return res;
    }
}