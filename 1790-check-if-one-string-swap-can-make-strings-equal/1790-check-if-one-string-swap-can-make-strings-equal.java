class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
      int count = 0;     
      int[] s1Array = new int[26];
      int[] s2Array = new int[26];
        
      for(int i = 0;i<s1.length();i++){
          char c1 = s1.charAt(i);
          char c2 = s2.charAt(i);
          if(c1 != c2)
            count++;
          if(count > 2)
            return false;
          s1Array[c1 -'a']++;
          s2Array[c2 -'a']++;
      }
        
      return Arrays.equals(s1Array, s2Array);
    }
}