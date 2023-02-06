class Solution {
    public int[] sortedSquares(int[] nums) {
        // for(int i=0;i<nums.length;i++){
        //     nums[i]*=nums[i];
        // } 
        // Arrays.sort(nums);
        // return nums;
        
        
        int n = nums.length;
        int i = 0, j = n - 1;
        
        int[] res = new int[n];
        for (int k = n - 1; k >= 0; k--)
            if (Math.abs(nums[i]) > Math.abs(nums[j]))
                res[k] = nums[i] * nums[i++];
            else
                res[k] = nums[j] * nums[j--];
        return res;
    }
}