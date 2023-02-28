class Solution {
    public String reverseVowels(String s) {
        // Set<Character> vowels = Set.of('a','e','i','o','u','A','E','I','O','U');
        // cost memory and slower
        char[] chars = s.toCharArray();
        int i=0,j=s.length()-1;
        while(i<j){
            while(i<j && !isvowel(chars[i]))
                i++;
            while(i<j && !isvowel(chars[j]))
                j--;
            if(i<j){
                char temp = chars[i];
                chars[i++] = chars[j];
                chars[j--] = temp;
            }
        }
        
        return new String(chars);
    }
    
    private boolean isvowel(char ch){
        if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'
           || ch=='A'||ch=='E' || ch=='I'|| ch=='O'|| ch=='U'){
            return true;
        }
        
        return false;
    }
}