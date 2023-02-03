class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> avilableNumbers = new HashSet<Integer>();
        Set<Integer> intersectedNumbers = new HashSet<Integer>();
        
        for(int i = 0; i<nums1.length; i++){
            avilableNumbers.add(nums1[i]);
        }
        
        for(int i = 0; i<nums2.length; i++){
            if(avilableNumbers.contains(nums2[i])){
               intersectedNumbers.add(nums2[i]);
            }        
        }
        
        return intersectedNumbers.stream().mapToInt(Integer::intValue).toArray();
    }
}