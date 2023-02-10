class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        int[] first = new int[26];
        for(int i = 0;i < n;i++)
            first[s1.charAt(i)-'a']++;
        
        int[] second = new int[26];
        for(int i = 0;i < m;i++){
            second[s2.charAt(i)-'a']++;
            if(i >= n)
                second[s2.charAt(i-n)-'a']--;
            
            if(Arrays.equals(first, second))
                return true;
        }
        return false;
    }
}