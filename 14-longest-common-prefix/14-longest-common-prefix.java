class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if (strs.length == 0) {return "";}

        String pre = strs[0];

        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < pre.length() || !pre.equals(strs[i].substring(0, pre.length()))) {
                pre = pre.substring(0, pre.length()-1);
                i--;
            }
        }

        return pre;
    }
}