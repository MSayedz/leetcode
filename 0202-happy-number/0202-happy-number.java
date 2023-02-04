class Solution {

    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        
        while(n != 1 && seen.add(n))
            n = getNextNumber(n);
        
        return n==1;
    }
    
    private int getNextNumber(int n){
        int sum = 0;
        while(n >0){
            int mod = n%10;
            sum += mod*mod;
            n = n/10;
        }
        return sum;
    }
}