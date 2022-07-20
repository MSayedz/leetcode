class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        
        map.put('[',']');
        map.put('(',')');
        map.put('{','}');
        
        char[] perantheses = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(int i=0;i< perantheses.length;i++){
            if(map.containsKey(perantheses[i])){
                stack.push(map.get(perantheses[i]));
            }else{
                if(stack.isEmpty())
                    return false;
                if(stack.pop() != perantheses[i])
                    return false;
            }
        }
        return stack.isEmpty();
    }
}