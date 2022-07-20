class Solution {
    public int numJewelsInStones(String J, String S) {
        
        int[] letters = new int[256];
        int count = 0;
        for (int i=0; i<S.length(); i++)
            letters[S.charAt(i)]++;
        
        for (int i=0; i<J.length(); i++) 
            count += letters[J.charAt(i)];
        
        return count;
        
        // int count=0;
        // for(char c: S.toCharArray()) 
        //     if(J.contains("" + c)) 
        //         count++;
        // return count;
    }
}