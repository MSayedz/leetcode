class Solution {
    public String reverseVowels(String s) {
        Set<Character> vowels = Set.of('a','e','i','o','u','A','E','I','O','U');
        System.out.println(vowels);
        char[] chars = s.toCharArray();
        int i=0,j=s.length()-1;
        while(i<j){
            while(i<s.length() && !vowels.contains(chars[i]))
                i++;
            while(j>-1 && !vowels.contains(chars[j]))
                j--;
            if(i<j){
                char temp = chars[i];
                chars[i++] = chars[j];
                chars[j--] = temp;
            }
        }
        
        return new String(chars);
    }
}