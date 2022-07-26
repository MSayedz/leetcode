class Solution {
    public char repeatedCharacter(String s) {
        int[] arr = new int[256];
        for(char cur:s.toCharArray()){
            arr[cur-'a']++;
            if(arr[cur-'a']>1)
                return cur;
        }
        return ' ';
    }
}