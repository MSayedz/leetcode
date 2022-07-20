class Solution {
    public int numJewelsInStones(String J, String S) {
        int count=0;
        for(char c: S.toCharArray()) 
            if(J.contains("" + c)) 
                count++;
        return count;
    }
}