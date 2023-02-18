class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int missing = mean*(n+rolls.length)-Arrays.stream(rolls).sum();
        
        if(missing <= 0 || missing < n || missing > 6*n)
            return new int[0];
        
        int[] res = new int[n];
        Arrays.fill(res, missing/n);

        for(int i=0;i<missing%n;i++)
            res[i]++;

        return res;
    }
}