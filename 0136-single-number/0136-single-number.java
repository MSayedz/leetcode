class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for(int i =0;i<nums.length;i++){
            if(!seen.add(nums[i])){
                seen.remove(nums[i]);
            }
        }
        return seen.iterator().next();
    }
}