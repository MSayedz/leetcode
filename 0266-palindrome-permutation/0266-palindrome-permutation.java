class Solution {
    public boolean canPermutePalindrome(String s) {
        int[] counts = new int[256];
        for(char cur:s.toCharArray()){
            counts[cur]++;
        }
        boolean oddCountFound = false;
        for(int i=0;i<256;i++){
            if(counts[i] != 0 && counts[i]% 2 !=0)
                if(oddCountFound)
                    return false;
                else
                    oddCountFound = true;
        }
        
        return true;
    }
}