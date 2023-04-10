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
    }
}