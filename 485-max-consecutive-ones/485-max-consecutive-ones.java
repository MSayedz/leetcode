class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res = 0;
        int ones = 0;
        for(int num: nums){
            if(num == 0){
                if(ones> res)
                    res = ones;
                ones = 0;
            } else
                ones++;
        }
        return ones> res ? ones : res;
    }
}