class Solution {
    public boolean backspaceCompare(String S, String T) {
        return evaluteString(S).equals(evaluteString(T));
    }
    
    String evaluteString(String S){
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int i = S.length()-1;i>=0;i--)
            if(S.charAt(i) == '#')
                count++;
            else if(count > 0)
                count--;
            else
                sb.append(S.charAt(i));
        
        return sb.toString();
    }
}