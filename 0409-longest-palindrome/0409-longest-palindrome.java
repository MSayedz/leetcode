class Solution {
    public int longestPalindrome(String s) {
        boolean[] charsArray = new boolean[128];
        int max = 0;
        for(int i=0; i<s.length();i++){
            if(charsArray[s.charAt(i)]){
                charsArray[s.charAt(i)] = false;
                max +=2;
            }else{
                charsArray[s.charAt(i)] = true;
            }
        }
        return max != s.length() ? ++max : s.length();
    }
}