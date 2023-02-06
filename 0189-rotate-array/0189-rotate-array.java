class Solution {
//     public void rotate(int[] nums, int k) {
//         if (nums == null || nums.length <2 || k < 0) 
//             return;
//         int length = nums.length;
//         k = k % length;
        
//         if (k == 0) 
//             return;
        
//         int[] temp = new int[length];
//         for (int i=0; i<nums.length; i++) 
//             temp[i] = nums[(i + length - k) % length];
//         for (int i=0; i<nums.length; i++) 
//             nums[i] = temp[i];
//     }
    
  public void rotate(int[] nums, int k) { 
    k = k % nums.length;
    reverse(nums, 0, nums.length - 1);
    reverse(nums, 0, k - 1);
    reverse(nums, k, nums.length - 1);
  }

  public void reverse(int[] nums, int l, int r) {
      int temp;
      while (l < r) {
          temp = nums[l];
          nums[l++] = nums[r];
          nums[r--] = temp;
      }
  }
}