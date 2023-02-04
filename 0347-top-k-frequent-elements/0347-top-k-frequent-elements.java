class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

//         PriorityQueue<Integer> maxHeap = 
//                          new PriorityQueue<>((a,b)-> map.get(a) - map.get(b));
//         for (int n: map.keySet()) {
//           maxHeap.add(n);
//           if (maxHeap.size() > k) 
//               maxHeap.poll();    
//         }
        
//         int[] res = new int[k];
//         for(int i = k - 1; i >= 0; --i) {
//             res[i] = maxHeap.poll();
//         }
//         return res;
        PriorityQueue<Map.Entry<Integer, Integer>> pq =
            new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());

        for (Map.Entry entry : map.entrySet()){
            pq.add(entry);
            if (pq.size() > k)
                pq.poll();
        }
        
        return Stream.generate(pq::poll).limit(pq.size())
            .map(x -> x.getKey()).mapToInt(Integer::intValue).toArray();
    }
}