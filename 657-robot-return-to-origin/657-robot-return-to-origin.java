class Solution {
    public boolean judgeCircle(String moves) {
        int u = 0;
        int r = 0;
        char[] chars = moves.toCharArray();
        
        for(char c:chars){
            switch (c){
                case 'U': u++; break;
                case 'D': u--; break;
                case 'R': r++; break;
                case 'L': r--; break;
            }
        }
        
        return u == 0 && r == 0;
        
    }
}