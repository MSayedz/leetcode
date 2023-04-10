class Solution {
    public String removeDuplicates(String S) {
        char[] res = S.toCharArray();
        int i=0;
        for(int j=0;j<res.length;i++,j++){
            res[i] = res[j];
            if(i>0 && res[i] == res[i-1])
                i-=2;
        }
        
        return new String(res,0,i);
//         Deque<Character> dequeue = new ArrayDeque<>();
        
//         for(int i=0;i<S.length();i++){
//             if(i == 0 || dequeue.size() == 0 || dequeue.peekLast() != S.charAt(i))
//                 dequeue.addLast(S.charAt(i));
//             else
//                 dequeue.removeLast();
//         }
        
//         return dequeue.stream().collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();

    }
}