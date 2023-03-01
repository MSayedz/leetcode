class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        if(nums.length == 0)
            return res;
        int start = nums[0];
        int end = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]-1==nums[i-1])
               end = nums[i];
            else {
                res.add(start == end ? ""+ start++ : start +"->"+ end);
                start = nums[i];
                end = nums[i];
            }
        }
        res.add(start == end ? ""+ start++ : start +"->"+ end);
        
        return res;
    }
}