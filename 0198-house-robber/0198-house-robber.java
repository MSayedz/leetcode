class Solution {
    public int rob(int[] nums) {
        int sum = 0, maxSum =0,previousSum = 0;
        
        for(int i=0;i<nums.length;i++){
            sum = maxSum;
            maxSum = Math.max(maxSum, previousSum+nums[i]);
            previousSum = sum;
        }
        
        return maxSum;
    }
}