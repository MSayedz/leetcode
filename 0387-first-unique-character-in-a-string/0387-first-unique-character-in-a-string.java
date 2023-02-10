class Solution {
    public int firstUniqChar(String s) {
        // int res = s.length();
        // for(int i=0; i<26; i++){
        //     int firstIndex = s.indexOf(i+'a');
        //     if(firstIndex!= -1){
        //         int lastIndex = s.lastIndexOf(i + 'a');
        //         if(firstIndex == lastIndex && firstIndex < res)
        //             res = firstIndex;
        //     }
        // }
        // return res == s.length() ? -1: res;
        
        
        char[] charList = new char[256];
        for(int i=0;i<s.length(); i++)
            charList[s.charAt(i)] ++;
        for(int i=0;i<s.length(); i++)
            if(charList[s.charAt(i)] ==1)
                return i;
        return -1;
    }
}