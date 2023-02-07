class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> nums1Map = new HashMap<>();
        Map<Integer,Integer> nums2Map = new HashMap<>();
        
        for(int num:nums1)
            nums1Map.put(num,nums1Map.getOrDefault(num,0)+1);
        for(int num:nums2)
            nums2Map.put(num,nums2Map.getOrDefault(num,0)+1);
        
        List<Integer> res = new ArrayList();
        for(int num:nums1Map.keySet()){
            if(nums2Map.containsKey(num)){
                int count = Math.min(nums1Map.get(num), nums2Map.get(num));
                for(int i=0;i<count;i++)
                    res.add(num);
            }
        }
        
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}