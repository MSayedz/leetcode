class Solution {
    public boolean detectCapitalUse(String word) {  
        // return word.matches("[A-Z]*|.[a-z]*"); too slow
        if (word.length() < 2)
            return true;   
        int count = 0;
        for(char cur:word.toCharArray())
            if(cur - 'a' < 0)
                count++;
        if(count == 0 || count == word.length())
            return true;
        if(count > 1)
            return false;
        
        return word.charAt(0) - 'a' < 0;
    }
}