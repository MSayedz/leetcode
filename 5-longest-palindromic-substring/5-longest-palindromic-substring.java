class Solution {
    int startIndex=0, maxLength=0;
    
    public String longestPalindrome(String s) {
        if(s == null || s.length() <1) return s;
        
        for(int i=0;i< s.length();i++){
            longestPalindrome(s,i,i);
            longestPalindrome(s,i,i+1);
        }
        
        return s.substring(startIndex, startIndex + maxLength-1);
    }
    
    private void longestPalindrome(String str,int start, int end){
        while(start >= 0 && end < str.length() && str.charAt(start) == str.charAt(end)){
            start --;
            end ++;
        }
        
        if(maxLength < end - start){
            maxLength = end - start;
            startIndex = start+1;
        }
    }
}