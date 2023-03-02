class Solution {
    public boolean detectCapitalUse(String word) {     
        int count = 0;
        for(char cur:word.toCharArray())
            if(cur - 'a' < 0)
                count++;
        if(count == word.length())
            return true;
        if(count > 1)
            return false;
        return count == 1 ? word.charAt(0) - 'a' < 0 : true;
    }
}