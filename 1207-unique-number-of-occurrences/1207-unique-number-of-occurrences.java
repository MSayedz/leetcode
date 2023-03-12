class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        // Map<Integer, Integer> counts = new HashMap<>();
        // Set<Integer> set = new HashSet<>();
        // for(int cur:arr)
        //     counts.put(cur, counts.getOrDefault(cur, 0)+1);
        // for(int i:counts.keySet()){
        //     if(counts.get(i)>0 && !set.add(counts.get(i))){
        //         return false;
        //     }
        // }
        // return true;
        
        Arrays.sort(arr);
        HashSet<Integer> set = new HashSet<>();

        int count = 1;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] == arr[i-1]) 
                count++;
            else {
                if(!set.add(count)) 
                    return false;
                count = 1;
            }
        }
        
        return set.contains(count) ? false :true;
    }
}