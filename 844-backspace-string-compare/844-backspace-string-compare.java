class Solution {
    public boolean backspaceCompare(String S, String T) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        
        for(int i = S.length()-1;i>=0;i--)
            if(S.charAt(i) == '#')
                count++;
            else if(count > 0)
                count--;
            else
                sb.append(S.charAt(i));
        
        S = sb.toString();
        sb = new StringBuilder();
        
        count=0;
        for(int i = T.length()-1;i>=0;i--)
            if(T.charAt(i) == '#')
                count++;
            else if(count > 0)
                count--;
            else
                sb.append(T.charAt(i));
        
        return S.equals(sb.toString());
    }
}