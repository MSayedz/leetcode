class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<words.length;i++){
            if(i!=0)
                sb.append(" ");
            words[i] = new StringBuilder(words[i]).reverse().toString();
            sb.append(words[i]);
        }
        return sb.toString();
    }
}