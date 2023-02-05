class Solution {
    public int pivotIndex(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int result = -1;
        int totalSum = 0;
        int leftSum = nums[0];
        for(int i: nums) 
            totalSum += i;
        
        if (totalSum - leftSum == 0)
            return 0;
        
        for(int i = 1; i < nums.length; i++){
            leftSum += nums[i];
            totalSum -= nums[i-1];
            if (leftSum == totalSum) 
                return i;
        }
        return result;
    }
}