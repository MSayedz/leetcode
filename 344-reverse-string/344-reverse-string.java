class Solution {
    public void reverseString(char[] s) {
        int len = s.length;
        char temp;
        for(int i=0;i< s.length/2 ;i++){
            temp = s[i];
            s[i] = s[--len];
            s[len] = temp;
        } 
    }
}