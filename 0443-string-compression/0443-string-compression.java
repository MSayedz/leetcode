class Solution {
    public int compress(char[] chars) {
        
        StringBuilder sb = new StringBuilder();
        char cur = chars[0];
        int count = 1;
        for(int i =1;i<chars.length;i++){
            if(cur == chars[i])
                count ++;
            else{
                sb.append(cur);
                if(count != 1)
                    sb.append(count);
                count = 1;
                cur = chars[i];
            }
        }
        
        sb.append(cur);
        if(count != 1)
            sb.append(count);
        
        for (int i = 0; i < sb.length(); i++) {
            chars[i]=sb.charAt(i);
        }
        
        return sb.length();
    }
}