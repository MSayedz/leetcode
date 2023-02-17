class Solution {
    public int characterReplacement(String s, int k) {
        int res = 0, maxNum = 0, count[] = new int[128];
        
        for (int i = 0; i < s.length(); ++i) {
            maxNum = Math.max(maxNum, ++count[s.charAt(i)]);
            if (res - maxNum < k)
                res++;
            else
                count[s.charAt(i - res)]--;
        }
        
        return res;
    }
}