class Solution {

    private Map<Integer, List<Integer>> map = new HashMap<>();
    
    public Solution(int[] nums) {
        map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            List<Integer> indexList = this.map.getOrDefault(nums[i], new ArrayList<>());
            indexList.add(i);
            this.map.put(nums[i], indexList);
        }
    }
    
    public int pick(int target) {
        List<Integer> curList = this.map.get(target);
        return curList.get(new Random().nextInt(curList.size()));
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */