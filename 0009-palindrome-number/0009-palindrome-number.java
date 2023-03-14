class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        // String s = "" + x;
        // for(int i=0,j=s.length()-1;i<j;){
        //     if(s.charAt(i++) != s.charAt(j--))
        //         return false;
        // }
        // return true;
        
        int rev = 0;
        int temp = x;
        while(temp != 0){
            rev = rev*10+(temp % 10);
            temp = temp/10;
        }
        
        return x == rev;
    }
}