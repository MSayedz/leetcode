class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        int[] first = new int[256];
        for(int i = 0;i < n;i++)
            first[s1.charAt(i)]++;
        
        int[] second = new int[256];
        for(int i = 0;i < m;i++){
            second[s2.charAt(i)]++;
            if(i >= n)
                second[s2.charAt(i-n)]--;
            
            if(Arrays.equals(first, second))
                return true;
        }
        return false;
    }
}