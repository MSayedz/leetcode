class Solution {
    public int[] decompressRLElist(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i=i+2)
            count+=nums[i];
        
        int[] res = new int[count];
        int k =0;
        
        for(int i=0;i<nums.length;i++){
            count = nums[i++];
            while(count--!=0)
                res[k++] =nums[i];
        }
        return res;
            
    }
}