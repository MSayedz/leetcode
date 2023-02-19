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
        
        return Stream.generate(heap::poll)
            .limit(k).collect(Collectors.toList());
    }
}