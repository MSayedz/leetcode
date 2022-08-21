class Solution {
    String[] codes;
    public int uniqueMorseRepresentations(String[] words) {
        codes = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<String>();
        for(String s: words)
            set.add(getCode(s));
        return set.size();
    }
    
    private String getCode(String s){
        StringBuilder sb = new StringBuilder();
        for(char c: s.toCharArray()){
            sb.append(codes[c-'a']);
        }
        return sb.toString();
    }
}