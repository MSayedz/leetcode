class Solution {
    public int findDuplicate(int[] nums) {
        int[] seen = new int[nums.length];
        
        for(int num:nums){
            seen[num]++;
            if(seen[num] > 1)
                return num;
        }
        
        return -1;
    }
}