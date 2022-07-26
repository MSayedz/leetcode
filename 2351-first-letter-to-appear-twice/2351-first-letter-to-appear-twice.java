class Solution {
    public char repeatedCharacter(String s) {
        Set<Character> chars = new HashSet<Character>();
        for(char cur:s.toCharArray())
            if(!chars.add(cur))
                return cur;
        return ' ';
    }
}