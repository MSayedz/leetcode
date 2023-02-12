class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        int j = 0;
        int len1 = word1.length();
        int len2 = word2.length();
        StringBuilder sb = new StringBuilder();
        
        while(i<word1.length() && j<word2.length()){
            sb.append(word1.charAt(i++)).append(word2.charAt(j++));
        }
        
        while(i<word1.length() && j == word2.length()){
            sb.append(word1.charAt(i++));
        }
        
        while(i==word1.length() && j<word2.length()){
            sb.append(word2.charAt(j++));
        }
        
        return sb.toString();
    }
}