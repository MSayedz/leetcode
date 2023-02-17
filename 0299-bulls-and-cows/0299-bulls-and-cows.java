class Solution {
    public String getHint(String secret, String guess) {
        int bulls = 0;
        int cows = 0;
        int[] counts = new int[10];
        for(int i=0;i<secret.length();i++)
            if(secret.charAt(i) == guess.charAt(i))
                bulls ++;
            else{
                if(counts[secret.charAt(i)-'0']++ < 0) 
                    cows++;
                if(counts[guess.charAt(i)-'0']-- > 0) 
                    cows++;
            }
        
        StringBuilder sb = new StringBuilder();
        
        sb.append(bulls).append("A").append(cows).append("B");
        
        return sb.toString();
    }
}