class Solution {
    public void sortColors(int[] nums) {
        int start = 0,cur = 0,end = nums.length-1;
        int temp;
        while(cur <= end)
            if(nums[cur] == 2){
                temp = nums[cur];
                nums[cur] = nums[end];
                nums[end--] = temp;
            } else if (nums[cur] == 0){
                temp = nums[cur];
                nums[cur++] = nums[start];
                nums[start++] = temp;
            } else
                cur++;
                
    }
}