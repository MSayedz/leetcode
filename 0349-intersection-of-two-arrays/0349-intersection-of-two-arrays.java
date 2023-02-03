class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> intersectedNumbers = new HashSet<Integer>();
        Set<Integer> avilableNumbers = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        
        for(int i = 0; i<nums2.length; i++){
            if(avilableNumbers.contains(nums2[i])){
               intersectedNumbers.add(nums2[i]);
            }        
        }
        
        return intersectedNumbers.stream().mapToInt(Integer::intValue).toArray();
    }
}