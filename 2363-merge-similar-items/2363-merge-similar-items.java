class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int[] cur:items1){
            map.put(cur[0], cur[1]);
        }
        
        for(int[] cur:items2){
            map.put(cur[0], map.getOrDefault(cur[0], 0)+cur[1]);
        }
        
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> cur;
        for(int key:map.keySet()){
            cur = new ArrayList<>();
            cur.add(key);
            cur.add(map.get(key));
            res.add(cur);
        }
        Collections.sort(res, (a,b) -> a.get(0) -b.get(0));
        return res;
    }
}