class Solution {
    public int trap(int[] height) {
        int right = height.length - 1, left = 0
           , maxRight = 0, maxLeft = 0, res = 0;
        
        while (left <= right) {
            if (height[left] > height[right]) {
                if (height[right] >= maxRight) 
                    maxRight = height[right--];
                else 
                    res += maxRight - height[right--];
            } else {
                if (height[left] >= maxLeft) 
                    maxLeft = height[left++];
                else 
                    res += maxLeft - height[left++];
            }
        }
        return res;
    }
}