class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {        
        int i=m-1,j=n-1;
        int k = nums1.length-1;
        while(i>=0 && j>=0)
            if(nums1[i] < nums2[j])
                nums1[k--] = nums2[j--];
            else
                nums1[k--] = nums1[i--];
        while(j>=0)
            nums1[k--] = nums2[j--];
        
        // for(int k=nums1.length-1;k>=0;k--){
        //     if(i >= 0 && (j < 0 || nums1[i] > nums2[j]))
        //         nums1[k] = nums1[i--];
        //     else
        //         nums1[k] = nums2[j--];
        // }
        
        
        // Java 8
        // System.arraycopy(
        //     IntStream.concat(
        //             Arrays.stream(nums1, 0, m),
        //             Arrays.stream(nums2, 0, n)
        //         )
        //         .sorted()
        //         .toArray()
        //     , 0, nums1, 0, nums1.length);;
    }
}