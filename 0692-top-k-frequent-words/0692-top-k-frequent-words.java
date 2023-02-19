class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map = new HashMap<>();
        
        for(String word:words)
            map.put(word, map.getOrDefault(word, 0)+1);
        
        PriorityQueue<String> heap 
            = new PriorityQueue<String>(
            (a,b)-> map.get(b) == map.get(a) 
            ? a.compareTo(b) : map.get(b) - map.get(a));
        
        heap.addAll(map.keySet());
        
        List<String> res = new ArrayList<>();
		while(!heap.isEmpty() && k-- > 0) 
			res.add(heap.poll());
        return res;
        // return heap.stream().limit(2).collect(Collectors.toList());
    }
}