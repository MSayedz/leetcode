class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> counts = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for(int cur:arr)
            counts.put(cur, counts.getOrDefault(cur, 0)+1);
        for(int i:counts.keySet()){
            if(counts.get(i)>0 && !set.add(counts.get(i))){
                return false;
            }
        }
        return true;
    }
}