class Solution {
    public int minimumLength(String s) {
        int left = 0;
        int right = s.length()-1;
        boolean stringUpdate = true;
        while(left< right && stringUpdate){
            stringUpdate = false;
            if(s.charAt(left) == s.charAt(right)){
                stringUpdate = true;
                while(left< right && s.charAt(left) == s.charAt(left+1))
                    left++;
                while(left< right && s.charAt(right) == s.charAt(right-1))
                    right--;
                
                if(left != right){
                    left++;
                    right--;
                }else 
                    return 0;
            }
        }
        
        return right - left + 1;
    }
}