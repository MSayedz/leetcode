class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int i = s.lastIndexOf(' ');
        return s.length() - i - 1;
        
        // String[] str = s.trim().split(" ");
        // if(str.length > 0){
        //     return str[str.length-1].length();
        // }
        // return s.length();
    }
}