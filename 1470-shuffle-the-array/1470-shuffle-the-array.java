class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[n*2];
        int j=0;
        for(int i=0;i<res.length;i++){
            res[i++] = nums[j];
            res[i] = nums[n+j++];
        }
        return res;
    }
}