class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i) == '#'){
                int x = (s.charAt(--i) -'0')-1;
                int y = (s.charAt(--i) -'0');
                y*=10;
                y+=x;
                sb.append((char)('a' + y));
            }else
                sb.append((char)('a' + (s.charAt(i) - '0')-1));
        }
        
        return sb.reverse().toString();
    }
}