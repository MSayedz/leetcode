class Solution {
    public boolean isPalindrome(String s) {
         
        s=s.toLowerCase();
        for(int i=0, j = s.length()-1;i<s.length();){
            if(!Character.isLetterOrDigit(s.charAt(i)))i++;
            else if(!Character.isLetterOrDigit(s.charAt(j)))j--;
            else{
                if(s.charAt(i) != s.charAt(j))
                    return false;
                i++;j--;
            }
        }
        
        return true;
       /*
       String actual = 
             s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String rev = new StringBuffer(actual).reverse().toString();
        return actual.equals(rev);
        */
    }
}