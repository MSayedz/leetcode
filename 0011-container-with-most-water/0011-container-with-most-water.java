class Solution {
    public int maxArea(int[] height) {
        int right = height.length - 1, left = 0, maxArea = 0, curArea = 0;
         while (left < right) {
            curArea = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, curArea);
             
            if (height[left] < height[right])
                left++;
            else
                right--;
        }
        return maxArea;
    }
}