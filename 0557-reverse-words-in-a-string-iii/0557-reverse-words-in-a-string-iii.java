class Solution {
    public String reverseWords(String s) {
        
        String[] stringList = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0; i< stringList.length;i++){
            if(i != 0)
                sb.append(" ");
                
            char[] reversed = stringList[i].toCharArray();
            int l = 0;
            int r = reversed.length-1;
            while(l<r){
                char temp = reversed[l];
                reversed[l++] = reversed[r];
                reversed[r--] = temp;
            }
            sb.append(new String(reversed));
        }
        
        return sb.toString();
        
        // String[] words = s.split(" ");
        // StringBuilder sb = new StringBuilder();
        // for(int i=0;i<words.length;i++){
        //     if(i!=0)
        //         sb.append(" ");
        //     words[i] = new StringBuilder(words[i]).reverse().toString();
        //     sb.append(words[i]);
        // }
        // return sb.toString();
    }
}