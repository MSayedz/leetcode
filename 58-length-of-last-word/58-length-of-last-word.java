class Solution {
    public int lengthOfLastWord(String s) {
        String[] str = s.split(" ");
        for(int i=str.length-1; i>=0;i++){
            String cur = str[i].trim();
            if(cur.length() != 0){
                return cur.length();
            }
        }
        return s.length();     
    }
}