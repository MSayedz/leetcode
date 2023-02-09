class Solution {
    public String licenseKeyFormatting(String s, int k) {
        s = s.replaceAll("-","").toUpperCase();
        
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        for(int i=chars.length-1,j=0;i>=0;i--){
            sb.append(chars[i]);
            if(++j == k && i>0){
                sb.append('-');
                j=0;
            }            
        }
        
        return sb.reverse().toString();        
    }
}