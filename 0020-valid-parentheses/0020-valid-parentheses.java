class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') 
                stack.push(s.charAt(i));
            else {
                if (stack.isEmpty()) 
                    return false;
                
                if (s.charAt(i) == ')' && stack.pop() != '(') 
                    return false;
                else if (s.charAt(i) == ']' && stack.pop() != '[') 
                    return false; 
                else if (s.charAt(i) == '}' && stack.pop() != '{')
                    return false;
            }
        }

        return stack.isEmpty();
        
//         Map<Character,Character> map =  new HashMap<>();
//         map.put('(',')');
//         map.put('[',']');
//         map.put('{','}');
        
//         Deque<Character> stack = new ArrayDeque<>();
//         for(int i = 0;i<s.length();i++){
//             if(map.containsKey(s.charAt(i)))
//                 stack.push(s.charAt(i));
//             else if(stack.isEmpty() || map.get(stack.pop()) != s.charAt(i))
//                 return false;
//         }
        
//         return stack.isEmpty();
    }
}