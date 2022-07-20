class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        
        List<String> srtList;
        
        for(String str : strs){
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            
            srtList = map.getOrDefault(sortedStr, 
                                       new ArrayList<>());
            srtList.add(str);
            map.put(sortedStr,srtList);
        }
        
        List<List<String>> res = new ArrayList<>();
        for(String key: map.keySet())
            res.add(map.get(key));
        
        return res;
    }
}