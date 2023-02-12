class Solution {
    public int missingNumber(int[] nums) {
        boolean[] allNums = new boolean[nums.length+1];
        
        for(int i = 0; i < nums.length; i++)
            allNums[nums[i]] = true;
        
        for(int i = 0; i< allNums.length; i++)
            if(allNums[i] == false)
                return i;
        
        return -1;
        
    }
}