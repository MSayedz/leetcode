class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] chars = new int[128];
        
        for(char cur:magazine.toCharArray())
            chars[cur] ++;
        
        for(char cur:ransomNote.toCharArray())
            chars[cur] --;
        
        for(int i=0;i<128;i++)
            if(chars[i] <0)
                return false;
        
        return true;
    }
}