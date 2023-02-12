class Solution {
    public char findTheDifference(String s, String t) {
        if(s.length()>t.length())
            return findTheDifference(t, s);
        
        int[] nums = new int[128];
        
        for(int i=0;i<s.length();i++){
            nums[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            nums[t.charAt(i)-'a']--;
            if(nums[t.charAt(i)-'a'] <0)
                return t.charAt(i);
        }
        return ' ';
    }
}