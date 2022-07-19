class Solution {
    public int thirdMax(int[] nums) {
        long firstMax = Long.MIN_VALUE,
        secondMax = Long.MIN_VALUE,
        thirdMax = Long.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]> firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = nums[i];
            } else if(nums[i]> secondMax && nums[i] < firstMax) {
                thirdMax = secondMax;
                secondMax = nums[i];
            } else if( nums[i] > thirdMax && nums[i] < secondMax)
                thirdMax = nums[i];
            
        }
    return (int)(thirdMax == Long.MIN_VALUE ? firstMax: thirdMax);
    }
    /*
        public int thirdMax(int[] nums) {
        Set<Integer> maximums = new HashSet<>();
        for (int num : nums) {
            maximums.add(num);
            if (maximums.size() > 3) 
                maximums.remove(Collections.min(maximums));
        }
        
        if (maximums.size() == 3) 
            return Collections.min(maximums);
        
        return Collections.max(maximums);
    }
    */
}