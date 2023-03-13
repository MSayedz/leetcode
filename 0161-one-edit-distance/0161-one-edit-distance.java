class Solution {
    public boolean isOneEditDistance(String s, String t) {
        if(s == null && t == null)
            return false;
        if(s.length()>t.length())
            return isOneEditDistance(t, s);
        int count =0;
        for(int i = 0, j=0;i<t.length();i++){
            if(j<s.length() && s.charAt(j) == t.charAt(i))
                j++;
            else if(s.length() == t.length()){
                count++;
                j++;
            } else
                count++;
        }
        
        return count == 1;
    }
}