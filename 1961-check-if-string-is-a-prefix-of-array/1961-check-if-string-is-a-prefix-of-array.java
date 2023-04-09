class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder sb = new StringBuilder();
        for(String cur: words){
            sb.append(cur);
            if(s.equals(sb.toString()))
                return true;
        }
        
        return false;
    }
}