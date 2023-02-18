class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int missing = mean*(n+rolls.length)-Arrays.stream(rolls).sum();
        
        if(missing <= 0 || missing < n || missing > 6*n)
            return new int[0];
        
        int[] res = new int[n];
        int x = missing/n;
        Arrays.fill(res, x);
        int y = missing%n;
        for(int i=0;i<y;i++)
            res[i]++;

        return res;
    }
}