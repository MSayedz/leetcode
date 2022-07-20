class Solution {
    public int strStr(String haystack, String needle) {
        if(needle == null || "".equals(needle)) return 0;
        
        if(haystack != null && haystack.contains(needle)){
            char[] needleChars = needle.toCharArray();
            char[] haystackChars = haystack.toCharArray();
            for(int i = 0; i< haystackChars.length;i++){ if(haystack.substring(i,i+needleChars.length).equals(needle)){
                    return i;
                }
            }
        }
        
        return -1;
    }
}