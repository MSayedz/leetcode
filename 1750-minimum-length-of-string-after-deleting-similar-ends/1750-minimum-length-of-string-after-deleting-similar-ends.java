class Solution {
    public int minimumLength(String s) {
        int left = 0, right = s.length()-1;
        while(left<right) {
            char c = s.charAt(left);
            if(s.charAt(right)!=c) {
                break;
            }
            while(s.charAt(left)==c && left<right) {
                left++;
            }
            while(s.charAt(right)==c && left<=right) {
                right--;
            }
        }
        return Math.max(0, right-left+1);
    }
}