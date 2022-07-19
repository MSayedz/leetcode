class Solution {
    public int[] twoSum(int[] nums, int target) {
        int y;
        for(int i = 0; i< nums.length; i++){
           y = target - nums[i];
           for (int j = i+1; j< nums.length; j++){
                if(nums[j] == y)
                    return new int[] {i,j};
            }
        }
        return null;
    }
}