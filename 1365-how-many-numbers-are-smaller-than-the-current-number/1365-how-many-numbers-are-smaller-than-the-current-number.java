class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        int[] helper = new int[101];
        
        for(int num : nums) 
            helper[num]++;
        
        for(int i = 1; i < helper.length; i++) 
            helper[i] += helper[i-1];
        
        for(int i = 0; i < res.length; i++) 
            res[i] = nums[i] == 0 ? 0 : helper[nums[i] - 1];
        
        return res;
        
        /*
        int[] res = new int[nums.length];
        int count =0;
        for(int i=0;i<nums.length;i++){
            count =0;
            for(int j=0;j<nums.length;j++){
                if(i!=j && nums[i] >nums[j])
                    count++;
            }
            res[i]=count;
        }
        return res;
        */
    }
}