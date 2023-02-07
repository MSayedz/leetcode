class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
//         Map<Integer,Integer> nums1Map = new HashMap<>();
        
//         for(int num:nums1)
//             nums1Map.put(num,nums1Map.getOrDefault(num,0)+1);
        
//         List<Integer> res = new ArrayList();
//         for(int num:nums2){
//             if(nums1Map.containsKey(num)){
//                 if(nums1Map.get(num)>0){
//                     res.add(num);
//                     nums1Map.put(num,nums1Map.get(num)-1);
//                 }
//             }
//         }
        
//         return res.stream().mapToInt(Integer::intValue).toArray();
        
        
        int[] count = new int[1001];
        
        for(int num:nums1)
            count[num]++;

        List<Integer> list = new ArrayList();
        for(int num:nums2){
            if(count[num]>0){
                list.add(num);
                count[num]--;
            }
        }

        int[] res = new int[list.size()];
        for(int k = 0; k < list.size();k++) 
            res[k] = list.get(k);
        return res;
    }
}