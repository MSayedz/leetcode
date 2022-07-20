class Solution {
    public int lengthOfLastWord(String s) {
        
        String[] str = s.trim().split(" ");
        if(str.length > 0){
            return str[str.length-1].length();
        }
        return s.length();  
        
    }
}