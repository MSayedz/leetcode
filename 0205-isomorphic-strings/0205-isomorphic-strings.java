class Solution {
    public boolean isIsomorphic(String s, String t) {

        char[] st = s.toCharArray();
        char[] tt = t.toCharArray();

        int length = st.length;
        if(length != t.length())
            return false;

        char[] sm = new char[256];
        char[] tm = new char[256];

        for(int i=0; i<length; i++){
            char sc = st[i];
            char tc = tt[i];
            if(sm[sc] == 0 && tm[tc] == 0){
                sm[sc] = tc;
                tm[tc] = sc;
            }else{
                if(sm[sc] != tc || tm[tc] != sc){
                    return false;
                }
            }
        }
        return true;
    }
}