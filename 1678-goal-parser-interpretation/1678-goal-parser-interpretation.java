class Solution {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<command.length();i++){
            if('G' == command.charAt(i))
                sb.append('G');
            else if('(' == command.charAt(i) && ')' == command.charAt(i+1)){
                sb.append('o');
                i++;
            } else {
                sb.append("al");
                i+=3;
            } 
        }
        
        return sb.toString();
    }
}