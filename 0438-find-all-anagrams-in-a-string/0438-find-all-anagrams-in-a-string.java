class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<Integer>();
        if(s == null || p == null || s.length() < p.length() || p.isEmpty()) 
            return result;

        char[] alphabets = new char[26];
        for(char c : p.toCharArray()) 
            alphabets[c-97]++;

        int right = 0, count = p.length(), left = 1 - p.length();
        char[] stream = s.toCharArray();
        while(right < s.length()) {
            if(alphabets[stream[right]-97] > 0) 
                count--;

            alphabets[stream[right++]-97]--;

            if(left > -1) {
                if(count == 0) {
                    result.add(left);
                }
                alphabets[stream[left]-97]++;
                if(alphabets[stream[left]-97] > 0) 
                    count++;
            }
            left++;
        }

        return result;
    }
}