class Solution {
    
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int[] cache = new int[256];
        for (int i = 0, j = 0; i < s.length(); i++) {
            j = cache[s.charAt(i)] == 0 ? j : Math.max(j, cache[s.charAt(i)]);
            cache[s.charAt(i)] = i+1;
            maxLen = Math.max(maxLen, i-j+1);
        }
        return maxLen;
                 
//         int maxLen = 0;
//         Set<Character> set = new HashSet<>(); 

//         int left = 0, right = 0;
//         while(right < s.length()) { 
//             while(set.contains(s.charAt(right)))
//                 set.remove(s.charAt(left++));  
//             set.add(s.charAt(right++)); 
//             maxLen = Math.max(maxLen, right - left);
//         }

//         return maxLen;
    }
}