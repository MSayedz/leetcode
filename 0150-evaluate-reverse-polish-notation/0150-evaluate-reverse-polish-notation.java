class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0;i<tokens.length;i++){
            if(isOperator(tokens[i])){
                stack.push(calulate(stack.pop(), stack.pop(), tokens[i]));
            } else {
                stack.push(Integer.valueOf(tokens[i]));
            }
        }
        
        return stack.peek();
    }
    
    private boolean isOperator(String s){
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
    }
    
    private int calulate(int b, int a, String operator){
        switch(operator){
            case "+" :
                return a + b;
            case "-" :
                return a - b;
            case "*" :
                return a * b;
            case "/" :
                return a / b;
        }
        
        return 0;        
    }
}