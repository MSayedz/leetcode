class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = nums1.length-n-1;
        int j =  n-1;
        int cur = nums1.length-1;
        while(i>=0 && j>=0)
            if(nums1[i] < nums2[j])
                nums1[cur--] = nums2[j--];
            else
                nums1[cur--] = nums1[i--];
        while(j>=0)
            nums1[cur--] = nums2[j--];
                       
    }
}