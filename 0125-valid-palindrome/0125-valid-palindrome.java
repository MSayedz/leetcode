class Solution {
    public boolean isPalindrome(String s) {
        char[] c = s.toLowerCase().toCharArray();
        
        for (int i = 0, j = c.length - 1; i < j; ) {
            if (!Character.isLetterOrDigit(c[i])) 
                i++;
            else if (!Character.isLetterOrDigit(c[j])) 
                j--;
            else if (c[i++] != c[j--])
                return false;
        }
        return true;
        
       /*
        String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String rev = new StringBuffer(actual).reverse().toString();
        return actual.equals(rev);
        */
    }
}