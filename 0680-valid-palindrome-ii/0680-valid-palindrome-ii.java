class Solution {
    public boolean validPalindrome(String s) {
        return validPalindrome(s, 0, s.length() - 1, false);
    }
    
    private boolean validPalindrome(String s, int start, int end, boolean hasDeleted) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                if (hasDeleted) 
                    return false;
                else 
                    return validPalindrome(s, start + 1, end, true) 
                    || validPalindrome(s, start, end - 1, true);
            }
            
            start++;
            end--;
        }
        return true;
    }
}