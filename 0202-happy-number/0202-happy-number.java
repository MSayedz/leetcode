class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        
        while(n != 1 && seen.add(n)){
            int sum = 0;
            while(n >0){
                int mod = n%10;
                sum += mod*mod;
                n = n/10;
            }
            n = sum;
        }
        return n==1;
    }
}