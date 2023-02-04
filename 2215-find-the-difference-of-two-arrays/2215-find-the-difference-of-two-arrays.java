class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(nums2).filter(n -> !set1.contains(n)).boxed().collect(Collectors.toSet());
        
        Arrays.stream(nums2).forEach(set1::remove);
        
        return Arrays.asList(new ArrayList<>(set1), new ArrayList<>(set2));
        
//         Set<Integer> nums1Set = new HashSet<>();        
//         Set<Integer> nums2Set = new HashSet<>();
        
//         nums1Set = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
//         nums2Set = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
        
//         List<Integer> list1 = new ArrayList<>();
//         for(int i:nums1Set)
//             if(!nums2Set.contains(i))
//                 list1.add(i);        
//         List<Integer> list2 = new ArrayList<>();
//         for(int i:nums2Set)
//             if(!nums1Set.contains(i))
//                 list2.add(i);
        
//         List<List<Integer>> res = new ArrayList<>();
//         res.add(list1);
//         res.add(list2);
        
//         return res;
    }
}